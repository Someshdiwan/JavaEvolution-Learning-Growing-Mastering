import java.util.Comparator;
import java.util.PriorityQueue;

class MyComp2 implements Comparator<Integer>
{
    public int compare(Integer o1,Integer o2){
        if(o1<o2)return 1;
        if(o1>o2)return -1;
        return 0;
    }
}
public class PriorityQueueDemo1 {
    public static void main(String[] args) {
        //PriorityQueue<Integer> PQ = new PriorityQueue<>();

        PriorityQueue<Integer> PQ = new PriorityQueue<>(new MyComp());

        PQ.add(20);
        PQ.add(10);
        PQ.add(30);
        PQ.add(5);
        PQ.add(15);
        PQ.add(3);

        System.out.println(PQ.peek());

        PQ.forEach((x)-> System.out.print(" "+x));

        PQ.poll();

        System.out.println("\n"+"After Deletion");

        PQ.forEach((x)-> System.out.print(" "+x));
    }
}
