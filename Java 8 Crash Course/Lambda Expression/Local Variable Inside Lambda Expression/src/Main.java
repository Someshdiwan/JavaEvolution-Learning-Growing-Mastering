public class Main {
    int a = 2;  // instance variable (allowed to modify inside lambda).

    public static void main(String[] args) {
        new Main().doSomething();
    }

    private void doSomething() {
        // Using lambda to implement Employee interface.
        // below is Function not class.
        Employee employee = () -> {
            int x = 10;
            //Local Variable.
            System.out.println(x); //this is inside Function not class, that's why we not use (this.x) here

            a = 3;
            return "100";
        };

        //Below We are doing this using Anonymous Inaner class.
        // Below is Class.(Anonymous Inaner class).
        Employee employee1 = new Employee() {
            int x = 10;
            //Ye abhi class mai hai anonymous, so this is an instance variable.

            @Override
            public String getSalary() {
                System.out.println(this.x); //"x" is instances variable.
                return "100";
            }
        };
    }
}
