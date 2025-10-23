#include <stdio.h>
#include <pthread.h>
#include <unistd.h>

// Shared global variable accessed by all threads
volatile long int a = 0;

// Thread function 1 — performs addition from 1 to 499,999
void* threadFunction1(void* args)
{
    int i;
    long int localA = 0;
    for (int i = 1; i < 500000; i++)
    {
        a = a + i;  // Update shared variable (not thread-safe)
    }
    return NULL;
}

// Thread function 2 — performs addition from 1 to 1,000,000
void* threadFunction2(void* args)
{
    int i;
    long int localA = 0;
    for (i = 1; i <= 1000000; i++) {
        a = a + i;  // Update shared variable (not thread-safe)
    }
    return NULL;
}

int main(int argc, char** argv)
{
    int i;
    pthread_t one, two;
    a = 0;  // Initialize shared variable

    // Simple loop performing addition without threads
    for(i = 1; i <= 500000; i++) {
        a = a + i;
    }

    // Print final value (only single-threaded computation here)
    printf("Final value of a = %ld\n", a);

    return 0;
}

/*
•	Runs only a single-threaded loop in main() — threadFunction1 and threadFunction2 are defined but never used.
•	The final printed value of a comes only from the loop in main().
•	Essentially, it’s not concurrent; it’s just a regular summation program.
•	No thread creation (pthread_create) or joining (pthread_join) happens.

Result: predictable and consistent, because there’s no threading or race condition.
*/