public class Shoes {
    // Instance attributes.
    private int size;
    private String color;

    // Setters.
    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getters
    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        // I have brown moccasins size 31
        Shoes moccasins = new Shoes();
        moccasins.setColor("brown");
        moccasins.setSize(31);

        // I also have a pair of black boots size 32
        Shoes boots = new Shoes();
        boots.setColor("black");
        boots.setSize(32);

        System.out.println("I have moccasins size " + moccasins.getSize());
        System.out.println("I also have " + boots.getColor() + " boots.");
    }
}
