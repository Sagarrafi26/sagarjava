package linkedlist;
import java.util.LinkedList;
import java.util.ArrayList;

public class removelist {
    public static void main(String[] args){
        ArrayList<String> al=new ArrayList<String>();
        al.add("BIke");
        al.add("car");
        al.add("Jeep");
        LinkedList<String> list2=new LinkedList<String>();
        list2.addAll(al);
        list2.addFirst("lorry");
        list2.addLast("Truck");
         list2.clear();
        for(String s:list2){
            System.out.println(s);
        }
        list2.removeAll(al);
         for(String s:list2){
            System.out.println(s);
        }
    

    }
    
}
