import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>(); //Default capacity 10.

        List.add(1); //Index Zero
        List.add(5); //Index One
        List.add(80); //Index Two

        // System.out.println(List.get(3));
        // Throw exception

        // System.out.println(List.get(2));
        // System.out.println(List.size());

        System.out.println(List.contains(5));
        System.out.println(List.contains(50));

        /*
        List.remove(2);
        List.add(2,100);
        List.set(2,1000);
        */

        for(int x:List)
            System.out.print(x+" "+"\n");

        for(int i=0; i<List.size(); i++) {
            System.out.print(List.get(i)+" ");
        }
    }
}
