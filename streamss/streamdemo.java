package streamss;
import java.util.*;
import java.util.stream.Collectors;


public class streamdemo {
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);
        al.add(30);
        System.out.println(al);
        List<Integer>listeven=al.stream().filter(i->i%2==0).collect(Collectors.toList());
         System.out.println(listeven);
    }
    
}
