package lambda;

@FunctionalInterface
interface Intertwo2{
    public void add(int a,int b);
}

public class lambdademo {
    public static void main(String[] args){
        Intertwo2 inte2 =(a,b)->System.out.println(a+b);
        inte2.add(23,33);
        
    
    }
}
