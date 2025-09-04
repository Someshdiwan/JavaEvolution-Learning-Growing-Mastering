public class CalculateDiscount {
    double calculateTotalWithDiscount(double... prices)
    // Method to calculate the total after applying a discount.
    {
        double sum = 0;

        // Calculate the sum of all prices.
        for (double price : prices) {
            sum += price;
        }

        if (sum < 500)
        // Apply discounts based on the sum.
        {
            System.out.println("Applying 10% discount (Total is less than 500).");
            return sum * 0.9; // 10% discount.
        }
        else if (sum >= 500 && sum <= 1000)
        {
            System.out.println("Applying 5% discount (Total is between 500 and 1000).");
            return sum * 0.95; // 5% discount
        }
        else
        {
            System.out.println("No discount applied (Total is greater than 1000).");
            return sum; // No discount for totals above 1000
        }
    }
    public static void main(String[] args) {
        CalculateDiscount calculator = new CalculateDiscount();

        double total1 = calculator.calculateTotalWithDiscount(100, 150, 200);
        System.out.println("Total after discount: " + total1);

        double total2 = calculator.calculateTotalWithDiscount(300, 250);
        System.out.println("Total after discount: " + total2);

        double total3 = calculator.calculateTotalWithDiscount(600, 500);
        System.out.println("Total after discount: " + total3);
    }
}
