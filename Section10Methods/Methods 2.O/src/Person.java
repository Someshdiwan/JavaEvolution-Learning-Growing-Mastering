public class Person {
    //attributes of every Person object.
    // attributes of every Person object
    private int YearBorn;
    private int YearDeceased;
    private String Name;

    // constructor
    public Person(String Name, int YearBorn, int YearDeceased) {
        this.Name = Name;
        this.YearBorn = YearBorn;
        this.YearDeceased = YearDeceased;
    }

    // instance method
    public void epitaph() {
        int age = YearDeceased - YearBorn;
        System.out.println(Name + " lived to an age of " + age);
    }

    public static void main(String[] args) {
        Person person = new Person("Mary", 1932, 1999);
        person.epitaph();
    }
}
