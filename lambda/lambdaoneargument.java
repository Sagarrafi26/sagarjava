package lambda;
@FunctionalInterface
interface Intertwo{
    public int square(int x);
}

public class lambdaoneargument {
    public static void main(String[] args){
        Intertwo inte =(x)->{return x*x;};
        int square1=inte.square(5);
        System.out.println(square1);
    }
}
