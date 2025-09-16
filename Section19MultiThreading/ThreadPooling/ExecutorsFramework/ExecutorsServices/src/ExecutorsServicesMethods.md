ExecutorService Methods (Quick Notes):

1.	submit(Runnable task) → Executes a task without returning a result.
2.	submit(Callable<T> task) → Executes a task and returns a Future result.
3.	submit(Runnable task, T result) → Executes a task and returns a preset result via Future.
4.	shutdown() → Initiates an orderly shutdown, no new tasks accepted.
5.	shutdownNow() → Attempts to stop all running tasks immediately.
6.	awaitTermination(long timeout, TimeUnit unit) → Waits for tasks to finish after shutdown.
7.	isShutdown() → Checks if shutdown has been initiated.
8.	isTerminated() → Checks if all tasks have finished after shutdown.
9.  invokeAll(Collection<Callable<T>> tasks) → Executes multiple tasks and returns a list of Future objects. 
10. invokeAny(Collection<Callable<T>> tasks) → Executes multiple tasks and returns the result of one successful task.

⸻
