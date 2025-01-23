import java.util.Scanner;

public class TestCasesCC
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        {
            for (int i = 0; i < 5; i++)
            {
                int N = scanner.nextInt();  // Read each integer input
                System.out.println(N);   // Print the integer
            }
        }
    }
}

/*
Manually Reading Each Input:

Scanner read = new Scanner(System.in);

int A = read.nextInt();
int B = read.nextInt();
int C = read.nextInt();
int D = read.nextInt();
int E = read.nextInt();

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
    }
            }
Explanation:
Using a Loop: This approach is more scalable and cleaner, especially when dealing with a large number of inputs. The loop runs 5 times, reading and printing each input.
Manually Reading Each Input: This approach works well for a small, fixed number of inputs like 5. You read each input individually and print it.*/
