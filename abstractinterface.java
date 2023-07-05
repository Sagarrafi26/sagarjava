interface Interns{
    public void a();
    public void b();
    public void c();
    public void d();
}
    abstract class Myclass implements Interns{
        public void a(){
            System.out.println("hello from A method");
        }
    }
    class Sube extends Myclass{

        @Override
        public void b() {
            System.out.println("Hello from B");
        }

        @Override
        public void c() {
            System.out.println("Hello from C");
        }

        @Override
        public void d() {
            System.out.println("Hello from D");
        }

    }



public class abstractinterface {
    public static void main(String[] args){
        Sube s=new Sube();
        s.a();
        s.b();
        s.c();
        s.d();


    }
    
}
