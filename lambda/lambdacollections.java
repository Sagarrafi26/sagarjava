package lambda;
import java.util.*;

public class lambdacollections {
    public static void main(String[]  args){
        ArrayList<Integer>ats=new ArrayList<Integer>();
        ats.add(65);
        ats.add(24);
        ats.add(15);
        ats.add(56);
        ats.add(76);
        for(Integer i:ats){
            System.out.println(i);
        }
        Collections.sort(ats,(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
        System.out.println("descending order");
        for(Integer i2:ats){
            System.out.println(i2);
        }
    }
    
}
