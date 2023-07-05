package exceptionhandling;
import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
    public static void main(String[] args){
        ArrayList<String> al=new ArrayList<String>();
        al.add("Sagar");
        al.add("Jai");
        al.add("Prabhas");
        System.out.println(al);
        Iterator iter=al.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        for(String s:al){
            System.out.println(s);
        }
        ArrayList<Integer>al2=new ArrayList<Integer>();
        al2.add(25);
        al2.add(24);
        al2.add(2);
        System.out.println(al2);
        Iterator iter2=al2.iterator();
        while(iter2.hasNext()){
            System.out.println(iter2.next());
        }

    }
    
}
