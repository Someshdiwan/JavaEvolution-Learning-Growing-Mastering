//Pending solve it
class StackOverFlow extends Exception
{
    public String toString()
    {
        return "Stack is Full";
    }
}

class StackUnderFlow extends Exception
{
    public String toString()
    {
        return "Stack is Empty";
    }
}

class Stack
{
    private int size;
    private int top=-1;
    private int S[];

    public Stack(int sz)
    {
        size=sz;
        S=new int[sz];
    }

    public void push(int x) throws StackOverFlow
    {
        if(top==size-1)
            throw new StackOverFlow();
        top++;
        S[top]=x;
    }

    public int pop() throws StackUnderFlow
    {
        int x=-1;

        if(top==-1)
            throw new StackUnderFlow();
        x=S[top];
        top--;
        return x;
    }
}

public class StackOverAndUnderFlow
{
    public static void main(String[] args)
    {
        Stack st=new Stack(5);
        try
        {
            st.push(10);
            st.push(15);
            st.push(10);
            st.push(15);
            st.push(10);
            st.push(15);

        }
        catch(StackOverFlow s)
        {
            System.out.println(s);
        }

    }
}

/*
class StackOverFlow extends IllegalStateException {

    @Override
    public String toString() {
        return "Stack is Full";
    }
}

class StackUnderFlow extends IllegalStateException {

    @Override
    public String toString() {
        return "Stack is Empty";
    }
}

class Stack {

    private final int[] values;
    private int count = 0;

    public Stack(int capacity) {
        values = new int[capacity];
    }

    public int getCapacity() {
        return values.length;
    }

    public void push(int x) throws StackOverFlow {
        if (count == values.length) {
            throw new StackOverFlow();
        }
        values[count] = x;
        ++count;
    }

    public int pop() throws StackUnderFlow {
        if (count == 0) {
            throw new StackUnderFlow();
        }
        --count;
        return values[count];
    }
}*/