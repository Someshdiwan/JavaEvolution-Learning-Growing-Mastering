public class CountLoop {
    public static void main(String[] args) {
        int res = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                res++;
            }
        }
        System.out.println(res);
    }
}

/*

i=0, j=0, res=1
i=0, j=1, res=2
i=0, j=2, res=3
        ...
i=0, j=9, res=10
        ----Completed iteration 1 of outer loop----
i=1, j=0, res=11
i=1, j=1, res=12
        ...and so on


   j→  0  1  2  3  4  5  6  7  8  9
i↓
0    1  2  3  4  5  6  7  8  9  10
1    11 12 13 14 15 16 17 18 19 20
2    21 22 23 24 25 26 27 28 29 30
...
9    91 92 93 94 95 96 97 98 99 100

*/
