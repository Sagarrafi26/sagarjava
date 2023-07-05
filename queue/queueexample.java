package queue;
import java.util.*;

public class queueexample {
    public static void main(String[] args){
        PriorityQueue<String> pq=new PriorityQueue<String>();
        pq.add("Banana");
        pq.add("Mangoes");
        pq.add("Watermelon");
        pq.add("Grapes");
        System.out.println("head:"+pq.element());
        System.out.println("the head of the queue"+pq.peek());
        System.out.println("print the elements of the queue");
        Iterator tr=pq.iterator();
        while(tr.hasNext()){
            System.out.println(tr.next());

        }
        pq.remove();
        pq.poll();
        System.out.println("after removing");
        Iterator tr2 =pq.iterator();
        while(tr2.hasNext()){
            System.out.println(tr2.next());

        }

    }
    
}
