self.addEventListener("install", function (e) {
  console.log("Service Worker Installed");
});

self.addEventListener("fetch", function (e) {
  // Just let requests pass through for now
});