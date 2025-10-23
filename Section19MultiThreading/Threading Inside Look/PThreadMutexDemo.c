#include <stdio.h>
#include <pthread.h>
#include <unistd.h>

/* Shared global variable accessed by all threads */
volatile long int a = 0;

/* Mutex protecting the shared variable `a` */
static pthread_mutex_t a_mutex;

/* Thread function 1 — performs addition from 1 to 499,999 */
void* threadFunction1(void* args)
{
    for (int i = 1; i < 500000; i++)
    {
        pthread_mutex_lock(&a_mutex);
        a = a + i;
        pthread_mutex_unlock(&a_mutex);
    }
    return NULL;
}

/* Thread function 2 — performs addition from 1 to 1,000,000 */
void* threadFunction2(void* args)
{
    for (int i = 1; i <= 1000000; i++)
    {
        pthread_mutex_lock(&a_mutex);
        a = a + i;
        pthread_mutex_unlock(&a_mutex);
    }
    return NULL;
}

int main(int argc, char** argv)
{
    pthread_t one, two;

    pthread_mutex_init(&a_mutex, NULL);

    pthread_create(&one, NULL, threadFunction1, NULL);
    pthread_create(&two, NULL, threadFunction2, NULL);

    pthread_join(one, NULL);
    pthread_join(two, NULL);

    printf("Final value of a = %ld\n", a);

    pthread_mutex_destroy(&a_mutex);
    return 0;
}

/*
•   The mutex a_mutex ensures that updates to a are serialized so no two threads write a at the same time.
•	pthread_mutex_lock / pthread_mutex_unlock bracket the critical section that updates the shared state.

Small info: What is a mutex (C vs Java) — concise
•	C (pthread): a pthread_mutex_t is a kernel-aware or user-space primitive (implementation detail)
    used to ensure mutual exclusion.
    Threads call pthread_mutex_lock() to enter the critical section and pthread_mutex_unlock() to leave it.
    It prevents data races on shared memory.
•	Java: synchronized (monitor) and java.util.concurrent.locks.
    Lock provide mutual exclusion at the JVM level. synchronized(obj){...} implicitly acquires/releases an
    object monitor; ReentrantLock is an explicit lock with richer semantics.
    Under the hood, JVM monitors map to OS synchronization primitives (futex/mutex) or optimized user-space mechanisms.
*/
