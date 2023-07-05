interface A6{
    public void m1();
}
interface B4 extends A6{
    public void m2();
}

public class inheritanceinterface implements B4 {

    @Override
    public void m1() {
        System.out.println("hello from m1");
    }

    @Override
    public void m2() {
        System.out.println("hello from m2");
    }
    public static void main(String [] args){
        inheritanceinterface h=new inheritanceinterface();
        h.m1();
        h.m2();
    }
}
