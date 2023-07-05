package exceptionhandling.Thread;
class Wasted extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i+Thread.currentThread().getName());
        }
    }
}

public class threadrun {
    public static void main(String[] args){
        Wasted w1=new Wasted();
        Wasted w2=new Wasted();
        w1.run();
        w2.run(); 
        
    }
    
}
