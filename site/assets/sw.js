const cacheName = 'java-evolution-cache-v1';
const assetsToCache = [
  '/',
  '/JavaEvolution-Learning-Growing-Mastering/index.html',
  '/JavaEvolution-Learning-Growing-Mastering/assets/style.css',
  '/JavaEvolution-Learning-Growing-Mastering/assets/script.js',
  // Add more files as needed
];

self.addEventListener("install", (event) => {
  event.waitUntil(
    caches.open(cacheName).then((cache) => cache.addAll(assetsToCache))
  );
});

self.addEventListener("fetch", (event) => {
  event.respondWith(
    caches.match(event.request).then((response) => response || fetch(event.request))
  );
});


/*
self.addEventListener("install", function (e) {
  console.log("Service Worker Installed");
});

self.addEventListener("fetch", function (e) {
  // Just let requests pass through for now
});*/
