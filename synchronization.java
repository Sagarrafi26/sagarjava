class Test{
   synchronized void printTable(int n){
        for(int i=0;i<5;i++){
            System.out.println(n*i);
        }
        try{
            Thread.sleep(1000);
        }catch(Exception e){

        }
    }
}
class xyz extends Thread{
    Test t;
    xyz(Test t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class abc extends Thread{
    Test t;
    abc(Test t){
        this.t=t;
    }
    public void run(){
        t.printTable(10);
    }

}



public class synchronization {
    public static void main(String[] args){
    Test t=new Test();
    xyz w=new xyz(t);
    abc s=new abc(t);
    w.start();
    s.start();
    
}
}