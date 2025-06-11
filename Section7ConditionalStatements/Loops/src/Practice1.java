public class Practice
{
    public static void main(String[] args)
    {
        int points = /* Replace with an appropriate value */;
        boolean isVIPClient = /* Replace with an appropriate value */;

        if (points >= 10 || isVIPClient)
            System.out.println("Dear customer, your purchase has accredited you with points.");
        if (points > 10)
            System.out.println("You may spend your points on a set of " + points * 5 + " paper clips.");
        if (points >= 99 && isVIPClient)
            System.out.println("You may spend your points on a notebook.");
        if (points > 149 || isVIPClient)
            System.out.println("You may spend your points on a cutlery set.");
    }
}