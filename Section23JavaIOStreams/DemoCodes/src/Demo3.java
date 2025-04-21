import java.io.IOException;
class Demo3 {
    public static void main(String[] args)
    {
        try
        {
            int x = System.in.read();
            System.out.println( (char)x);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
/*
This program reads one character from the keyboard input (System.in.read()) and prints it.
It captures any input/output exceptions that might occur during reading.

Basically, it waits for you to press a key and then shows that character.
*/