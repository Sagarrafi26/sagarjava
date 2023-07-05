package linkedlist;
import java.util.LinkedList;
import java.util.Iterator;

public class linkedlistexam {
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<String>();
        list.add("Sagar");
        list.add("kasimbee");
        list.addFirst("first element");
        list.addLast("last element");
        list.add(2,"Rasool");
        Iterator iter=list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
