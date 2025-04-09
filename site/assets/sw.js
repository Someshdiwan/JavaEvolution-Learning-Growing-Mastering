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
