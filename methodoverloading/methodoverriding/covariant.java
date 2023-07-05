package methodoverloading.methodoverriding;
class A1{
    A1 get(){
        System.out.println("inside A");
        return this;
    }
}
class B1 extends A1{
    B1 get(){
        System.out.println("inside B");
        return this;
    }
}

public class covariant {
    public static void main(String[] args){
        B1 b =new B1();
        b.get();
    }
    
}
