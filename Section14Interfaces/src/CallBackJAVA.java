import java.util.Scanner;

/**
 * Java Program to Demonstrate Callback Mechanism Using an Interface
 *
 * This program showcases how to implement a callback mechanism in Java
 * using interfaces. Callbacks allow one piece of code to notify another
 * when an event occurs or a task completes.
 *
 * For more details, visit:
 * <a href="https://www.educba.com/java-callback-function/">Java Callback Function</a>
 *
 * Key Concepts:
 * - Interfaces for callback structure
 * - Implementing and invoking callbacks
 * - Simulating asynchronous task execution
 */

interface STax {
    double stateTax();
}

// Implementation class of Mumbai state tax.
class Mumbai implements STax {
    public double stateTax() {
        return 3000.0;
    }
}

// Implementation class of Himachal Pradesh state tax
class HP implements STax {
    public double stateTax() {
        return 1000.0;
    }
}

class CallBackJAVA {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the state name: ");
        String state = sc.next(); // name of the state

        // The state name is then stored in an object c
        Class c = Class.forName(state);

        // Create the new object of the class whose name is in c
        // Stax interface reference is now referencing that new object
        STax ref = (STax)c.newInstance();

		/*Call the method to calculate total tax
		and pass interface reference - this is callback .
		Here, ref may refer to stateTax() of Punjab or HP classes
		depending on the class for which the object is created
		in the previous step.
		*/

        calculateTax(ref);
    }
    static void calculateTax(STax t) {
        // calculate central tax
        double ct = 2000.0;

        // calculate state tax
        double st = t.stateTax();
        double totaltax = st + ct;

        System.out.println("Total tax = " + totaltax);
    }
}
