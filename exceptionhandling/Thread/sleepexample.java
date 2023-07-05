package exceptionhandling.Thread;
class Mythread3 implements Runnable{

    @Override
    public void run() {
        try{
            for(int i=0;i<5;i++){
        System.out.println("hello from childclass");
        Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }

}

public class sleepexample {
    public static void main(String[] args){
         try{
            for(int i=0;i<5;i++){
        System.out.println("hello from mainclass");
        Thread.sleep(700);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
        Mythread3 m=new Mythread3();
        Thread t=new Thread(m);
        t.start();
    }
    
}
