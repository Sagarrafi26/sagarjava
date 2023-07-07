package lambda;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.*;

public class predicatedemo {
    public static void main(String[] args){
        Predicate<Integer>p=I->I<10;
        System.out.println("IS 14 is less than 10 "+p.test(14));
        System.out.println("IS 3 is less than 10 "+p.test(3));
        Predicate<Collection> p2=c->c.isEmpty();
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(32);
        a.add(12);
        a.add(2);
        System.out.println("The arraylist is empty "+p2.test(a));


    }
    
}
