public class UniCode {
    public static void main(String args[])
    {
        char x = 0x03c8;
        for(char c = 0x0370; c <= 0x03FF; c++)
            System.out.print(c + " ");
        for(char b = 0x0900; b <= 0x970; b++)
            System.out.println(b);
    }
}