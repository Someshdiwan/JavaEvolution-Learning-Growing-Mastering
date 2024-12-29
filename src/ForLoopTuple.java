//tuples can be simulated using classes or Pair from external libraries (e.g., Apache Commons or JavaFX).
//Here is an example using a custom tuple class:

class Tuple {
    String first;
    String second;

    public Tuple(String first, String second) {
        this.first = first;
        this.second = second;
    }
}

public class ForLoopTuple {
    public static void main(String[] args) {
        Tuple[] tuples = {
                new Tuple("apple", "fruit"),
                new Tuple("carrot", "vegetable"),
                new Tuple("banana", "fruit")
        };

        // Iterating through the tuple array
        for (Tuple tuple : tuples) {
            System.out.println(tuple.first + ": " + tuple.second);
        }
    }
}