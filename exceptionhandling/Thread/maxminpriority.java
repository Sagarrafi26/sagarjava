package exceptionhandling.Thread;
class Wasted3 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class maxminpriority {
    public static void main(String[] args){
        Wasted3 w1=new Wasted3();
        Wasted3 w2=new Wasted3();
        w1.setName("Prabhas");
        w1.setPriority(Thread.MIN_PRIORITY);
         w2.setName("kasimbee");
        w2.setPriority(Thread.MAX_PRIORITY);
        w1.start();
        w2.start(); 
        
    }
    
}

