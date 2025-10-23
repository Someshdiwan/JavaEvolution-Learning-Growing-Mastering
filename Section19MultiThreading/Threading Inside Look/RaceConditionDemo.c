#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

// Shared variable used by both threads
volatile long int a = 0;

// Thread function 1 — increments 'a' by each loop index
void* threadFunction1(void* args)
{
    for (int i = 1; i <= 500000; i++) {
        a = a + i;  // Updating shared variable (not thread-safe)
    }
    return NULL;
}

// Thread function 2 — performs the same addition as thread 1
void* threadFunction2(void* args)
{
    for (int i = 1; i <= 500000; i++) {
        a = a + i;  // Concurrent modification of shared data
    }
    return NULL;
}

int main(int argc, char** argv)
{
    pthread_t one, two;  // Thread identifiers
    a = 0;               // Initialize shared variable

    // Start two threads running separate functions
    pthread_create(&one, NULL, threadFunction1, NULL);
    pthread_create(&two, NULL, threadFunction2, NULL);

    // Wait for both threads to finish
    pthread_join(one, NULL);
    pthread_join(two, NULL);

    // Print the final result after both threads have completed
    printf("Final value of a = %ld\n", a);

    return 0;
}

/*
•	Actually creates two threads with pthread_create.
•	Both threadFunction1 and threadFunction2 run concurrently, each modifying the same global variable a.
•	Because updates to a are not synchronized, the final result varies each run — a textbook race condition example.
•	Demonstrates real multithreading behavior.

Result: inconsistent and unpredictable — shows concurrency and data races.
*/