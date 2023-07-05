package polymorphism;

public class compiletime {
    void test(){
        System.out.println("No parameters is inside");
    }
    void test(int a){
        System.out.println("the value of a "+a);
    }
    void test(int a,int b){
        System.out.println("two parameters "+a +" "+b);
    }
    double test(double a){
        System.out.println("Overloading does not depend on return type");
        return a*a;
    }
    

public static void main(String[] args){
    compiletime c=new compiletime();
    c.test();
    c.test(2);
    c.test(25,46);
    double result=c.test(2.5);
    System.out.println(result);
}
}
