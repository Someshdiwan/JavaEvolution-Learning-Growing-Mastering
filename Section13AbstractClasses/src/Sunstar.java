abstract class Sunstar {
    abstract void printInfo();
}

// Abstraction performed using the keyword 'extends'.
class Employee extends Sunstar {
    void printInfo() {
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

class Base {
    public static void main(String args[]) {
        Sunstar s = new Employee();
        s.printInfo();
    }
}
