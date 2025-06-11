public class SubstringsDemo
{
    public static void main(String[] args)
    {
        String alphabet = "ABCDEFG";
        //letter: index. A:0, B:1, C:2, D:3, E:4, F:5, G:6
        String keyboard = "QWERTY";
        //letter: index. Q:0, W:1, E:2, R:3, T:4, Y:5

        System.out.println(alphabet.substring(1,7));
        System.out.println(keyboard.substring(0,5));
    }
}