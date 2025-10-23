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
    long int localA = 0;  // Missing variable declaration

    for (int i = 1; i < 500000; i++)
    {
        localA = localA + i;
    }

    pthread_mutex_lock(&a_mutex);
    a = a + localA;
    pthread_mutex_unlock(&a_mutex);

    return NULL;  // Always return something from void* thread functions
}

/* Thread function 2 — performs addition from 1 to 1,000,000 */
void* threadFunction2(void* args)
{
    long int localA = 0;

    for (int i = 1; i <= 1000000; i++)
    {
        localA = localA + i;
    }

    pthread_mutex_lock(&a_mutex);
    a = a + localA;
    pthread_mutex_unlock(&a_mutex);

    return NULL;
}

int main(int argc, char** argv)
{
    pthread_t one, two;

    /* Initialize the mutex before using it */
    pthread_mutex_init(&a_mutex, NULL);

    /* Create two threads that run concurrently */
    pthread_create(&one, NULL, threadFunction1, NULL);
    pthread_create(&two, NULL, threadFunction2, NULL);

    /* Wait for both threads to complete */
    pthread_join(one, NULL);
    pthread_join(two, NULL);

    printf("Final value of a = %ld\n", a);

    pthread_mutex_destroy(&a_mutex);

    return 0;
}