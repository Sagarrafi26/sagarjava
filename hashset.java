import java.util.*;
public class hashset {
    public static void main(String[] args){
        HashSet<String> vegetables=new HashSet<String>();
        vegetables.add("tomato");
        vegetables.add("carrot");
        vegetables.add("onion");
        Iterator its=vegetables.iterator();
         while(its.hasNext()){
            System.out.println(its.next());
         }
         ArrayList<String> aal=new ArrayList<String>();
         aal.addAll(vegetables);
         //call the sort method 
         Collections.sort(aal);
         for(String s:aal){
            System.out.println(s);
         }
         // another way converting hashset to treeset
         TreeSet<String> tr=new TreeSet<String>();
         tr.addAll(vegetables);
         Iterator ite =tr.iterator();
         while(ite.hasNext()){
            System.out.println(ite.next());
         }
    }
    
}
