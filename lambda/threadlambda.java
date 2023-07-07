package lambda;

public class threadlambda {
    public static void main(String[] args){
    Runnable r=()->{
        for(int i=0;i<5;i++){
            System.out.println(i+" childclass");
        }
    };
    r.run();
    System.out.println("inside main class");
}
    
}
