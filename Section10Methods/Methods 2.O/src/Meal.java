public class Meal {
    // Instance attributes
    private String name;
    private double cost;

    // Class constructor
    public Meal(String food, double price) {
        this.name = food;
        this.cost = price;
    }

    // Instance method: upgrade meal to combo (adds fixed extra cost)
    public void makeItACombo() {
        // Let's say making it a combo adds ₹50.0
        this.cost += 50.0;
        this.name += " Combo";
    }

    // Instance method: return bill amount
    public double getBill() {
        return this.cost;
    }

    // toString method for display
    @Override
    public String toString() {
        return name + " costs ₹" + cost;
    }
    public static void main(String[] args) {
        Meal m1 = new Meal("Burger", 120);
        System.out.println(m1);

        m1.makeItACombo();
        System.out.println("makeItACombo"+m1);

        System.out.println("Bill: ₹" + m1.getBill());
    }
}
