package lambda;
@FunctionalInterface
interface Inter{
    public void printHello();
}

public class lambdaexpression {
    public static void main(String[] args){
        Inter inter=()->System.out.println("hello from lambda");
        inter.printHello();
    }
    
}
