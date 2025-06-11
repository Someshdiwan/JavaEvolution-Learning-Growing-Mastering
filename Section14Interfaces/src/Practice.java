interface WaterBottle{
    String Color = "Blue";

    void fillUp();

    void poutOut();
}

public class Practice implements WaterBottle {
    public static void main(String[] args) {
        System.out.println(Color);

        Practice ex = new Practice();
        ex.fillUp();

        ex.poutOut();
    }

    @Override
    public void fillUp() {
        System.out.println("it is Filled.");
    }

    @Override
    public void poutOut() {
        System.out.println("Pour out");
    }
}



