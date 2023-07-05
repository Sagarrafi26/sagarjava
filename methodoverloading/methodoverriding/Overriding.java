package methodoverloading.methodoverriding;
class A{
    int x;
    public void show(int x){
        this.x=x;
        System.out.println("the value of x "+x);

    }
}
class B extends  A{
    int y;
    public void show(int y){
        this.y=y;
        System.out.println("the value of y "+y);
    }
}

public class Overriding {
    public static void main(String args[]){
        B b = new B();
        b.show(3);
    }
    
}
