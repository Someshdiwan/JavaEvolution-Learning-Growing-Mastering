import java.util.BitSet;

public class BitSetDemo {
    public static void main(String[] args) {
        // Create a BitSet with the default size (64 bits initially)
        BitSet bitSet1 = new BitSet();

        // Setting bits at specific positions
        bitSet1.set(0);   // set bit 0 -> true
        bitSet1.set(2);   // set bit 2 -> true
        bitSet1.set(4);   // set bit 4 -> true
        bitSet1.set(6);   // set bit 6 -> true

        System.out.println("BitSet1 after setting bits: " + bitSet1);
        // Output: {0, 2, 4, 6} (indices of set bits)

        // Check if a bit is set
        System.out.println("Is bit 4 set? " + bitSet1.get(4)); // true
        System.out.println("Is bit 5 set? " + bitSet1.get(5)); // false

        // Flip a bit (toggle value)
        bitSet1.flip(2);  // bit at index 2 changes from true -> false
        System.out.println("After flipping bit 2: " + bitSet1);

        // Clear a bit
        bitSet1.clear(4); // reset bit at index 4 -> false
        System.out.println("After clearing bit 4: " + bitSet1);

        // Create another BitSet
        BitSet bitSet2 = new BitSet();
        bitSet2.set(1);
        bitSet2.set(2);
        bitSet2.set(3);
        bitSet2.set(6);

        System.out.println("BitSet2: " + bitSet2);

        // Perform bitwise AND
        BitSet andResult = (BitSet) bitSet1.clone();
        andResult.and(bitSet2);
        System.out.println("BitSet1 AND BitSet2: " + andResult);

        // Perform bitwise OR
        BitSet orResult = (BitSet) bitSet1.clone();
        orResult.or(bitSet2);
        System.out.println("BitSet1 OR BitSet2: " + orResult);

        // Perform bitwise XOR
        BitSet xorResult = (BitSet) bitSet1.clone();
        xorResult.xor(bitSet2);
        System.out.println("BitSet1 XOR BitSet2: " + xorResult);

        // Cardinality -> number of set bits
        System.out.println("Cardinality of BitSet1: " + bitSet1.cardinality());
    }
}

/* BitSet is superefficient for handling large collections of boolean values, supports fast bitwise operations,
and is great for algorithms (e.g., visited nodes in graphs, bloom filters, permissions flags).

1.	Creation:
•	new BitSet() → creates a BitSet with an initial capacity of 64 bits (grows dynamically if needed).
2.	Setting Bits:
•	set(index) → sets the bit at index to true.
3.	Checking Bits:
•	get(index) → returns true if the bit is set.
4.	Flipping Bits:
•	flip(index) → toggles the bit (true ↔ false).
5.	Clearing Bits:
•	clear(index) → sets the bit to false.
6.	Bitwise Operations:
•	and(BitSet) → intersection (common bits).
•	or(BitSet) → union (all bits).
•	xor(BitSet) → symmetric difference (bits that differ).
7.	Cardinality:
•	cardinality() → returns the number of bits set to true.
*/
