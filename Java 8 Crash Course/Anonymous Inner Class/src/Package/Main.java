package Package;

public class Main {
    public static void main(String[] args) {
        //We Cannot create an object of Interface.
        Employee E = new Employee() {
            @Override
            public String getSalary() {
                return "10 LPA";
            }

            @Override
            public String getType() {
                return "Software Engineer";
            }

            // Above is the Anonymous inner class.
            // You can remove the Software Engineer class now, and the code is still working.
            // You cannot use Lambda expression here because there are two methods inside the Employee Class.
            // 2 abstract methods we cannot use lambda expression
        };

        System.out.println(E.getSalary());
        System.out.println(E.getType());
    }
}
