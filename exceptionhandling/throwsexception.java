package exceptionhandling;

public class throwsexception {
    public void eligibility(int age){
    if(age>18){
        System.out.println("eligible to vote");
    }
    else{
        throw new ArithmeticException("Not eligible");
    
        
    }
}
public static void main(String[] args){
    throwsexception t=new throwsexception();
    try{
        t.eligibility(13);
    }catch(ArithmeticException e){
        System.out.println(e);
    }
}

    
}
