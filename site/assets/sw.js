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


const CACHE_NAME = "java-evolution-cache-v5"; // Updated version
const STATIC_ASSETS = [
    "/JavaEvolution-Learning-Growing-Mastering/",
    "/JavaEvolution-Learning-Growing-Mastering/default.html",
    "/JavaEvolution-Learning-Growing-Mastering/assets/style.css",
    "/JavaEvolution-Learning-Growing-Mastering/assets/favicon-96x96.png",
    "/JavaEvolution-Learning-Growing-Mastering/assets/favicon.svg",
    "/JavaEvolution-Learning-Growing-Mastering/assets/favicon.ico",
    "/JavaEvolution-Learning-Growing-Mastering/assets/apple-touch-icon.png",
    "/JavaEvolution-Learning-Growing-Mastering/assets/site.webmanifest",
    "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" // Cache CDN resource
];

// Simple offline fallback page
const OFFLINE_PAGE = `
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Offline</title>
    <style>
        body { font-family: 'Segoe UI', sans-serif; text-align: center; padding: 2rem; background: #f9f9f9; color: #333; }
        h1 { font-size: 1.5rem; }
        p { font-size: 1rem; }
    </style>
</head>
<body>
    <h1>You're Offline</h1>
    <p>Please check your internet connection and try again.</p>
</body>
</html>
`;

// Install event
self.addEventListener("install", (event) => {
    console.log("[Service Worker] Installing and caching static assets");
    self.skipWaiting();
    event.waitUntil(
        caches.open(CACHE_NAME).then((cache) => {
            // Cache static assets
            return cache.addAll(STATIC_ASSETS).then(() => {
                // Cache offline page
                const offlineResponse = new Response(OFFLINE_PAGE, {
                    headers: { 'Content-Type': 'text/html' }
                });
                return cache.put('/offline.html', offlineResponse);
            });
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
                    // Cache successful response
                    return caches.open(CACHE_NAME).then((cache) => {
                        cache.put(request, networkResponse.clone());
                        return networkResponse;
                    });
                })
                .catch(() => {
                    // Serve cached page or offline fallback
                    return caches.match(request).then((cachedResponse) => {
                        return cachedResponse || caches.match('/offline.html');
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
                // Refresh cache in background
                fetch(request).then((networkResponse) => {
                    caches.open(CACHE_NAME).then((cache) => {
                        cache.put(request, networkResponse);
                    });
                }).catch(() => {}); // Silent fail
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
                        return caches.open(CACHE_NAME).then((cache) => {
                            cache.put(request, networkResponse.clone());
                            // Limit cache size
                            cache.keys().then((keys) => {
                                if (keys.length > 50) {
                                    cache.delete(keys[0]);
                                }
                            });
                            return networkResponse;
                        });
                    }
                    return networkResponse;
                })
                .catch(() => {
                    // Fallback for non-HTML resources
                    if (request.url.includes('font-awesome')) {
                        return caches.match('https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css');
                    }
                    return caches.match('/offline.html');
                });
        })
    );
});