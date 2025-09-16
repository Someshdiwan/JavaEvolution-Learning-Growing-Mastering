enum Dept {
    CS,IT,CIVIL,ECE
}

public class EnumDemo {
    public static void main(String[] args) {
        Dept d = Dept.CIVIL;

        Dept list[] = Dept.values();

        // sabhi enum constants ko print karne ke liye loop
        for (Dept x : list) {
            System.out.println(x);
        }
        // Switch cases me bhi enum use ho sakta hai

        System.out.println(d.ordinal());
        // ordinal() index deta hai enum constant ka (0-based index)
    }
}
