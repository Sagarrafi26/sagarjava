package exceptionhandling;

public class Propagation {
    public void dostuff(){
        int x=34/0;
    }
    public void domorestuff(){
        dostuff();

    }
    public void doExtramorestuff(){
       try{

       
        domorestuff();
       }catch(ArithmeticException e){
        System.out.println(e);
       }
    }
    public static void main(String[] args){
        Propagation p=new Propagation();
        p.doExtramorestuff();
    }
    
}
