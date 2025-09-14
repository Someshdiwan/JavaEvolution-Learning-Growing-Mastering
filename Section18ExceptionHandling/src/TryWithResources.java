import java.io.FileInputStream;
import java.util.Scanner;

public class TryWithResources {

    static FileInputStream fi;
    static Scanner sc;

    static void Divide() throws Exception {
        fi=new FileInputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section18ExceptionHandling/src/TryWithResources.txt");

        try {
            sc = new Scanner(fi);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / b);
            System.out.println(a / c);
        }
        finally {
            fi.close(); //file input stream close

            sc.close(); //Error inside in the main because you close the scanner.
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            Divide(); //50 divide 40 = 1 Remainder
        }
        catch (Exception e) {
            System.out.println(e);
        }
        //Resources are not close and not error.
        //Remove Try finally block, and them uncomment this

        //int x= sc.nextInt();
        //System.out.println(x);
    }
}
