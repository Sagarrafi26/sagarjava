package exceptionhandling.Thread;
class Consumer{
    int amount=10000;
    synchronized  void withdraw(int amount){
        System.out.println("going to withdraw");
        if(this.amount<amount){
            System.out.println("insufficient");
            try{
                wait();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        this.amount -=amount;
        System.out.println("withdraw completed");

    }
    synchronized void deposit(int amount){
        System.out.println("going to deposit");
        this.amount +=amount;
        System.out.println("deposit completed");
        notify();
    }
}

public class Interthreadcomm {
    public static void main(String [] args){
        final Consumer c=new Consumer();
        new Thread(){
            public void run(){
                 c.withdraw(11000);

            }
        }.start();
        new Thread(){
            public void run(){
                c.deposit(5000);

            }
        }.start();
       
        
    }
    
}
