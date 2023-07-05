package Mapsdemo;
import java.util.*;

public class mytree {
    public static void main(String[] args){
        TreeMap<String,Integer> tree=new TreeMap<String,Integer>();
        tree.put("Sagar",22);
        tree.put("Karim",18);
        tree.put("Kasimbee",49);
        tree.put("Jon",12);
        Set s=tree.entrySet();
        for(Map.Entry<String,Integer>mt:tree.entrySet()){
            System.out.println(mt.getKey());
            System.out.println(mt.getValue());


        }
    }
    
}
