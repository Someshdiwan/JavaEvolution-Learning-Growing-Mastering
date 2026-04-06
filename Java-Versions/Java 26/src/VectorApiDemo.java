import jdk.incubator.vector.IntVector;
import jdk.incubator.vector.VectorSpecies;

public class VectorApiDemo {

    static final VectorSpecies<Integer> SPECIES = IntVector.SPECIES_PREFERRED;

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] b = {10, 20, 30, 40, 50, 60, 70, 80};
        int[] result = new int[a.length];

        addVectors(a, b, result);

        System.out.println("Vector Addition Result:");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    static void addVectors(int[] a, int[] b, int[] result) {

        int i = 0;
        int upperBound = SPECIES.loopBound(a.length);

        // Vectorized part
        for (; i < upperBound; i += SPECIES.length()) {
            var va = IntVector.fromArray(SPECIES, a, i);
            var vb = IntVector.fromArray(SPECIES, b, i);
            var vc = va.add(vb);
            vc.intoArray(result, i);
        }

        // Remaining elements (scalar fallback)
        for (; i < a.length; i++) {
            result[i] = a[i] + b[i];
        }
    }
}

/*
What changed: Previous vs New

Previous Java style:
- Used normal for-loop for array calculations
- One element processed at a time
- Limited CPU optimization

Example:
for (int i = 0; i < a.length; i++) {
    result[i] = a[i] + b[i];
}

New Java 26 style:
- Uses Vector API
- Multiple elements processed together
- Better use of SIMD instructions on supported CPUs

Why the new approach is better:
- Faster for large numeric workloads
- Better CPU utilization
- Useful in performance-heavy applications
- Cleaner API for vectorized operations

Pros:
1. Better performance
   - Multiple values processed in one operation

2. Modern computation style
   - Uses SIMD where hardware supports it

3. Scalable
   - Good for math-heavy programs

4. Built-in API
   - No external library needed

Cons:
1. Incubator feature
   - Vector API is still incubating in Java 26

2. More complex than simple loops
   - Harder for beginners compared to basic for-loop

3. Best for specific use cases
   - Useful mainly in data-heavy calculations

4. Requires module flag
   - Must compile and run with incubator module enabled

Best use case:
- Image processing
- Scientific calculations
- Machine learning preprocessing
- Large array computations

Compile and run:
javac --add-modules jdk.incubator.vector VectorApiDemo.java
java --add-modules jdk.incubator.vector VectorApiDemo
*/
