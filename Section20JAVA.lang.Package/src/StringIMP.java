public class StringIMP {
    public static void main(String[] args) {
        int n = 150000;

        double timeStringBuilder = useStringBuilder(n);
        double timeStringConcat = useStringConcat(n);

        System.out.println("Time elapsed using StringBuilder: " + timeStringBuilder + " seconds");
        System.out.println("Time elapsed using StringConcat : " + timeStringConcat + " seconds");

        System.out.println("\nStringBuilder was " + (int) (timeStringConcat / timeStringBuilder) + " times faster");
    }

    static double useStringBuilder(int n) {
        long start = System.nanoTime();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        long end = System.nanoTime();
        return (end - start) / (double) 1000000000;
    }

    static double useStringConcat(int n) {
        long start = System.nanoTime();
        String str = "";

        for (int i = 0; i < n; i++) {
            str += "a";
        }
        long end = System.nanoTime();
        return (end - start) / (double) 1000000000;
    }
}

/*
1. String immutable hoti hai
   - Har baar jab tum `str += "a"` likhte ho, ek naya String object ban jata hai.
   - Purane content ko copy karke new String create hoti hai.
   - Isliye agar tum 1,50,000 times loop me concatenate karte ho →
     har step me naye object banenge aur purana copy hoga.
   - Ye process O(n^2) complexity tak pahunch jata hai (badiya inefficient).

2. StringBuilder mutable hota hai
   - Ek hi underlying char[] buffer me data add hota hai.
   - Jab buffer full hota hai tabhi resize hota hai (doubling strategy).
   - Har append `O(1)` average time leta hai.
   - Isliye loop ka cost approx O(n) hota hai (linear).
   - Ye single-threaded me best performance deta hai.

3. StringBuffer bhi mutable hai lekin synchronized
   - Methods synchronized hote hain, matlab multiple threads ek hi object pe safe kaam kar sakte hain.
   - Synchronization overhead ki wajah se thoda slow hota hai compared to StringBuilder.
   - Agar single-threaded program hai to StringBuilder prefer karna chahiye.

4. Benchmark ka practical difference
   - Agar `n = 1,50,000`:
     - StringBuilder → milliseconds me kaam complete.
     - String concat → seconds lag jayenge.
   - Agar `n` aur bada kar diya (e.g., 5,00,000 ya 10,00,000):
     - String concat bahut zyada slow ho jayega (sometimes OutOfMemoryError bhi aa sakta hai).
     - StringBuilder phir bhi manageable time me kaam karega.

5. General rule of thumb
   - ✅ Agar tumhe frequent string modification karni hai → StringBuilder use karo.
   - ✅ Multi-threaded environment me → StringBuffer use karo.
   - ✅ Agar string constant hai aur change nahi karni → normal String use karo.
*/
