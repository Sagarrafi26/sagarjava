package exceptionhandling;

public class exceptionhand {
    public static void main(String[] args){
        System.out.println("before execution");
        try{
        int a=25;
        int b=0;
        int d =a/b;
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("after execution");
    }
    
}
