package Mapsdemo;
import java.util.*;

public class mapsdemonstrate {
    public static void main(String[] args){
        HashMap<Integer,String> hmap=new HashMap<Integer,String>();
        hmap.put(101,"Sagar");
        hmap.put(102,"Teja");
        hmap.put(103,"Vishnu");
        hmap.put(104,"Mahesh");
        Set s=hmap.entrySet();
        Iterator at =s.iterator();
        while(at.hasNext()){
            Map.Entry<Integer,String> m= (Map.Entry<Integer,String>)at.next();
        
        System.out.println(m.getKey());
        System.out.println(m.getValue());
        }
        System.out.println("--------");
        for( Map.Entry<Integer,String> m2:hmap.entrySet()){
             System.out.println(m2.getKey());
        System.out.println(m2.getValue());
        }
        System.out.println(" after removing elements");
        hmap.remove(101);
        hmap.remove(102,"Teja");
        for( Map.Entry<Integer,String> m3:hmap.entrySet()){

         System.out.println(m3.getKey());
        System.out.println(m3.getValue());
        }
        boolean flag =hmap.containsKey(100);
        System.out.println("the key whose hundred?"+flag);


    }
    
}
