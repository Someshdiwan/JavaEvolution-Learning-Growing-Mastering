// assets/sw.js
const CACHE_NAME = "java-evolution-cache-v7";
const STATIC_ASSETS = [
    "{{ '/' | relative_url }}",
    "{{ '/default.html' | relative_url }}",
    "{{ '/assets/style.css' | relative_url }}",
    "{{ '/assets/favicon-96x96.png' | relative_url }}",
    "{{ '/assets/favicon.svg' | relative_url }}",
    "{{ '/assets/favicon.ico' | relative_url }}",
    "{{ '/assets/apple-touch-icon.png' | relative_url }}",
    "{{ '/assets/site.webmanifest' | relative_url }}",
    "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
].map(p => p.toString()); // ensure strings

// Small debounce to avoid spamming cache writes
function debounce(func, wait) {
    let timeout;
    return function executedFunction(...args) {
        const later = () => {
            clearTimeout(timeout);
            func(...args);
        };
        clearTimeout(timeout);
        timeout = setTimeout(later, wait);
    };
}

// Install: pre-cache basic assets
self.addEventListener("install", event => {
    self.skipWaiting();
    event.waitUntil(
        caches.open(CACHE_NAME).then(cache => {
            // convert relative Liquid URLs to proper strings at build time
            return cache.addAll(STATIC_ASSETS).catch(err => {
                // Some assets may 404 during dev; swallow and continue to avoid blocking install
                console.warn('[SW] some static assets failed to cache', err);
            });
        })
    );
});

// Activate: cleanup old caches
self.addEventListener("activate", event => {
    event.waitUntil(
        caches.keys().then(names =>
            Promise.all(names.filter(n => n !== CACHE_NAME).map(n => caches.delete(n)))
        ).then(() => self.clients.claim())
    );
});

// Fetch handler: navigation-first for HTML, cache-first for other static assets
self.addEventListener("fetch", event => {
    const req = event.request;

    // Navigation requests => try network then fallback to cached default
    if (req.mode === 'navigate') {
        event.respondWith(
            fetch(req).then(networkRes => {
                // async cache update
                debounce(() => {
                    caches.open(CACHE_NAME).then(cache => cache.put(req, networkRes.clone()));
                }, 100)();
                return networkRes;
            }).catch(() => {
                return caches.match("{{ '/default.html' | relative_url }}") || caches.match("{{ '/' | relative_url }}") || new Response('<h1>Offline</h1><p>Please check your network.</p>', { headers: { 'Content-Type': 'text/html' }});
            })
        );
        return;
    }

    // For other requests: prefer cache, else fetch and cache (for same-origin & CDN)
    event.respondWith(
        caches.match(req).then(cached => {
            if (cached) {
                // refresh in background
                debounce(() => {
                    fetch(req).then(networkRes => {
                        caches.open(CACHE_NAME).then(cache => cache.put(req, networkRes.clone()));
                    }).catch(() => {/* silent */});
                }, 200)();
                return cached;
            }

            return fetch(req).then(networkRes => {
                // only cache GETs and same-origin or known CDN
                if (req.method === "GET" && (req.url.startsWith(self.location.origin) || req.url.includes('cdnjs.cloudflare.com'))) {
                    debounce(() => {
                        caches.open(CACHE_NAME).then(cache => {
                            cache.put(req, networkRes.clone());
                            // limit cache size (simple approach)
                            cache.keys().then(keys => {
                                if (keys.length > 50) cache.delete(keys[0]);
                            });
                        });
                    }, 200)();
                }
                return networkRes;
            }).catch(() => {
                // fallback for fonts/css from known CDN
                if (req.url.includes('cdnjs.cloudflare.com')) {
                    return caches.match('https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css');
                }
                return new Response('Resource unavailable offline.', { status: 503, statusText: 'Service Unavailable' });
            });
        })
    );
});