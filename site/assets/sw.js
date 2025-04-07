const CACHE_NAME = "java-evolution-cache-v2";
const urlsToCache = [
  "/JavaEvolution-Learning-Growing-Mastering/",
  "/JavaEvolution-Learning-Growing-Mastering/index.html",
  "/JavaEvolution-Learning-Growing-Mastering/assets/style.css",
  "/JavaEvolution-Learning-Growing-Mastering/assets/script.js",
  "/JavaEvolution-Learning-Growing-Mastering/assets/favicon-96x96.png",
  "/JavaEvolution-Learning-Growing-Mastering/assets/apple-touch-icon.png",
  // Add more assets like images, fonts, etc.
];

// Install event: caching essential files
self.addEventListener("install", (e) => {
  e.waitUntil(
    caches.open(CACHE_NAME).then((cache) => {
      return cache.addAll(urlsToCache);
    })
  );
  console.log("Service Worker Installed & Cached");
});

// Activate event: cleanup old caches
self.addEventListener("activate", (e) => {
  e.waitUntil(
    caches.keys().then((cacheNames) =>
      Promise.all(
        cacheNames
          .filter((name) => name !== CACHE_NAME)
          .map((name) => caches.delete(name))
      )
    )
  );
  console.log("Old caches cleaned up");
});

// Fetch event: serve cached files when offline
self.addEventListener("fetch", (e) => {
  e.respondWith(
    caches.match(e.request).then((response) => {
      return response || fetch(e.request);
    })
  );
});