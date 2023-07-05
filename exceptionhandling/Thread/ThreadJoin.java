package exceptionhandling.Thread;
class Busted implements Runnable{



@Override
public void run() {
    for(int i=0;i<5;i++){
        System.out.println(i+Thread.currentThread().getName());
    }
}
}

public class ThreadJoin {
    public static void main(String[] args){
        Busted b1=new Busted();
        Busted b2=new Busted();
        Busted b3=new Busted();
        Thread t1=new Thread(b1);
        Thread t2=new Thread(b2);
        Thread t3=new Thread(b3);
        t1.setName("SAGAR");
        t1.start();
        try{
            t1.join(1000);
        
        }catch(Exception e){

        }
        t2.start();
        t3.start();
    }
    
}

