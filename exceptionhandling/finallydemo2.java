//where exception occurs and handled

package exceptionhandling;
import java.util.Scanner;

public class finallydemo2 {
    public static  void main(String[] args){

    
    try{
        int a=34;
        System.out.println("enter the value of b");
        Scanner in =new Scanner(System.in);
        int b=in.nextInt();
        int c=a/b;
    }catch(Exception e){
        System.out.println(e);
    } 
    finally{
        System.out.println("finally is being handled");
    }
    
}
}
