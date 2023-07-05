package exceptionhandling.Thread;
class Mythread extends T hread{
    public void run(){
        System.out.println("hello from child class");
    }
}

public class threadexample {
    public static void main(String[] args){
        System.out.println(" hell from main class");
        Mythread m=new Mythread();
        m.start();
    }
    
}
