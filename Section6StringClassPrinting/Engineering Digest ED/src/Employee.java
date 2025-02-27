/* toString() method of the object class which is an in-built method in Java that returns the value of a given object
in string format.

By overriding the toString() method of the Object class, we can return values of the object.
If you want to represent any object as a string, toString() method comes into existence.
*/

public class Employee {
    //are instance variables (also known as fields or attributes) in the Employee class.
    //They represent the state or data of an object of the class.

    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString()
    {
        return id+" "+name;
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(12);
        e.setName(("Bro Chill and Play Chess"));
        System.out.println(e);
    }
}