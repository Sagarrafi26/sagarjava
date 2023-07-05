package methodoverloading.methodoverriding;
class A2{
    Object get(){
       return this;
    }
}
class B extends A2{
    String get(){
        return "Hello from Coveriant";
    }
}


public class Newdemo {
    public static void main(String[] args){
        B b=new B();
        String s = b.get();
        System.out.println(s);
    }
    
}
