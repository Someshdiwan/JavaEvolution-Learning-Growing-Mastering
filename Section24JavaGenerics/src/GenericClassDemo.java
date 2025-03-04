/* Java program to show working of user defined
 Generic classes

 We use < > to specify Parameter-type
 */
class Test<T> {

    // An object of type T is declared
    T obj;

    Test(T obj) { this.obj = obj; } // constructor

    public T getObject()
    {
        return this.obj;
    }
}

class GenericClassDemo {
    public static void main(String[] args)
    {
        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());

        Test<String> sObj = new Test<String>("Creating Instance of String type");
        System.out.println(sObj.getObject());
    }
}