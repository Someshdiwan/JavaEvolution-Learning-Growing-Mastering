// Custom Exception for Stack Overflow.
class StackOverFlow1 extends IllegalStateException {
    @Override
    public String toString() {
        return "Stack is Full";
    }
}

// Custom Exception for Stack Underflow.
class StackUnderFlow1 extends IllegalStateException {
    @Override
    public String toString() {
        return "Stack is Empty";
    }
}

class StackOverUnder {
    private final int[] values;
    private int count = 0;

    // Constructor to initialize stack with capacity.
    public StackOverUnder(int capacity) {
        values = new int[capacity];
    }

    public int getCapacity() {
        return values.length;
    }

    // Push method.
    public void push(int x) {
        if (count == values.length) {
            throw new StackOverFlow1();
        }
        values[count] = x;
        ++count;
    }

    // Pop method.
    public int pop() {
        if (count == 0) {
            throw new StackUnderFlow1();
        }
        --count;
        return values[count];
    }
}

public class TestStack {
    public static void main(String[] args) {
        StackOverUnder stack = new StackOverUnder(2);

        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);  // This will throw StackOverFlow1
        } catch (StackOverFlow1 e) {
            System.out.println(e);
        }

        try {
            System.out.println(stack.pop());  // 20
            System.out.println(stack.pop());  // 10
            System.out.println(stack.pop());  // This will throw StackUnderFlow1
        } catch (StackUnderFlow1 e) {
            System.out.println(e);
        }
    }
}
