/*
const CACHE_NAME = "java-evolution-cache-v3";
const urlsToCache = [
  "/JavaEvolution-Learning-Growing-Mastering/",
  "/JavaEvolution-Learning-Growing-Mastering/index.html",
  "/JavaEvolution-Learning-Growing-Mastering/assets/style.css",
  "/JavaEvolution-Learning-Growing-Mastering/assets/script.js",
  "/JavaEvolution-Learning-Growing-Mastering/assets/favicon-96x96.png",
  "/JavaEvolution-Learning-Growing-Mastering/assets/apple-touch-icon.png",
  "/JavaEvolution-Learning-Growing-Mastering/assets/web-app-manifest-192x192.png",
  "/JavaEvolution-Learning-Growing-Mastering/assets/web-app-manifest-512x512.png"
];

// Install event
self.addEventListener("install", (event) => {
  console.log("[Service Worker] Installing and caching static assets");
  self.skipWaiting();
  event.waitUntil(
    caches.open(CACHE_NAME).then((cache) => cache.addAll(urlsToCache))
  );
});

// Activate event
self.addEventListener("activate", (event) => {
  console.log("[Service Worker] Activated and cleaning old caches");
  event.waitUntil(
    caches.keys().then((cacheNames) =>
      Promise.all(
        cacheNames
          .filter((name) => name !== CACHE_NAME)
          .map((name) => caches.delete(name))
      )
    )
  );
  self.clients.claim();
});

// Fetch event
self.addEventListener("fetch", (event) => {
  event.respondWith(
    caches.match(event.request).then((cachedResponse) => {
      // Return from cache if available
      if (cachedResponse) {
        return cachedResponse;
      }

      // Otherwise fetch from network
      return fetch(event.request)
        .then((networkResponse) => {
          // Cache new fetched files (only GET and same-origin)
          if (
            event.request.method === "GET" &&
            event.request.url.startsWith(self.location.origin)
          ) {
            return caches.open(CACHE_NAME).then((cache) => {
              cache.put(event.request, networkResponse.clone());
              return networkResponse;
            });
          } else {
            return networkResponse;
          }
        })
        .catch(() =>
          // Offline fallback: serve homepage or a fallback page/image
          caches.match("/JavaEvolution-Learning-Growing-Mastering/index.html")
        );
    })
  );
});
*/

const CACHE_NAME = "java-evolution-cache-v6"; // Updated version
const STATIC_ASSETS = [
    "/JavaEvolution-Learning-Growing-Mastering/",
    "/JavaEvolution-Learning-Growing-Mastering/default.html",
    "/JavaEvolution-Learning-Growing-Mastering/assets/style.css",
    "/JavaEvolution-Learning-Growing-Mastering/assets/favicon-96x96.png",
    "/JavaEvolution-Learning-Growing-Mastering/assets/favicon.svg",
    "/JavaEvolution-Learning-Growing-Mastering/assets/favicon.ico",
    "/JavaEvolution-Learning-Growing-Mastering/assets/apple-touch-icon.png",
    "/JavaEvolution-Learning-Growing-Mastering/assets/site.webmanifest",
    "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
];

// Debounce function to limit cache updates
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

// Install event
self.addEventListener("install", (event) => {
    console.log("[Service Worker] Installing and caching static assets");
    self.skipWaiting();
    event.waitUntil(
        caches.open(CACHE_NAME).then((cache) => {
            return cache.addAll(STATIC_ASSETS);
        })
    );
});

// Activate event
self.addEventListener("activate", (event) => {
    console.log("[Service Worker] Activated and cleaning old caches");
    event.waitUntil(
        caches.keys().then((cacheNames) =>
            Promise.all(
                cacheNames
                    .filter((name) => name !== CACHE_NAME)
                    .map((name) => caches.delete(name))
            )
        )
    );
    self.clients.claim();
});

// Fetch event
self.addEventListener("fetch", (event) => {
    const request = event.request;

    // Handle navigation requests (HTML pages)
    if (request.mode === 'navigate') {
        event.respondWith(
            fetch(request)
                .then((networkResponse) => {
                    // Cache successful response asynchronously
                    debounce(() => {
                        caches.open(CACHE_NAME).then((cache) => {
                            cache.put(request, networkResponse.clone());
                            // Limit cache size
                            cache.keys().then((keys) => {
                                if (keys.length > 20) {
                                    cache.delete(keys[0]);
                                }
                            });
                        });
                    }, 100)();
                    return networkResponse;
                })
                .catch(() => {
                    // Fallback to cached default.html
                    return caches.match('/JavaEvolution-Learning-Growing-Mastering/default.html') ||
                           new Response('Network error: Please check your connection.', {
                               status: 503,
                               statusText: 'Service Unavailable'
                           });
                })
        );
        return;
    }

    // Handle other requests (CSS, images, fonts, etc.)
    event.respondWith(
        caches.match(request).then((cachedResponse) => {
            // Return cached response if available
            if (cachedResponse) {
                // Background cache refresh
                debounce(() => {
                    fetch(request).then((networkResponse) => {
                        caches.open(CACHE_NAME).then((cache) => {
                            cache.put(request, networkResponse);
                        });
                    }).catch(() => {}); // Silent fail
                }, 100)();
                return cachedResponse;
            }

            // Fetch from network
            return fetch(request)
                .then((networkResponse) => {
                    // Cache GET requests from same origin or Font Awesome CDN
                    if (
                        request.method === "GET" &&
                        (request.url.startsWith(self.location.origin) ||
                         request.url.startsWith('https://cdnjs.cloudflare.com'))
                    ) {
                        debounce(() => {
                            caches.open(CACHE_NAME).then((cache) => {
                                cache.put(request, networkResponse.clone());
                                // Limit cache size
                                cache.keys().then((keys) => {
                                    if (keys.length > 20) {
                                        cache.delete(keys[0]);
                                    }
                                });
                            });
                        }, 100)();
                    }
                    return networkResponse;
                })
                .catch(() => {
                    // Fallback for Font Awesome
                    if (request.url.includes('font-awesome')) {
                        return caches.match('https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css');
                    }
                    return new Response('Resource unavailable offline.', {
                        status: 503,
                        statusText: 'Service Unavailable'
                    });
                });
        })
    );
});