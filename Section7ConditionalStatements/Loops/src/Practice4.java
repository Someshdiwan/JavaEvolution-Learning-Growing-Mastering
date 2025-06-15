public class Practice4 {
    public static void main(String[] args) {
        int hour24Format = 13; //13 hours is equivalent to 1 P.M.
        boolean isItRaining = false;
        System.out.println("I'm hungry, let's eat something.");

        if (7 < hour24Format && hour24Format < 11 ) {
            System.out.print("Let's have breakfast at ");
            if (isItRaining)
                System.out.println("the kitchen.");
            else
                System.out.println("the back yard.");
        }

        else if (11 <= hour24Format && hour24Format < 15) {
            System.out.print("Let's have lunch at ");
            if (isItRaining)
                System.out.println("the dining room.");
            else
                System.out.println("a restaurant.");
        }

        else if (hour24Format < 21) {
            System.out.print("Let's have dinner at ");
            if (isItRaining)
                System.out.println("the dining room.");
            else
                System.out.println("the mall.");
        }

        else
            System.out.println("Thinking it through... this is no time to eat.");
    }
}
