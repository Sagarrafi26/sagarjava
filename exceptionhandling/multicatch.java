package exceptionhandling;
import java.util.*;
import java.util.Scanner;

public class multicatch {
    public static void main(String[] args){
    try{
        System.out.println("enter two numbers to divide");
        Scanner in =new Scanner(System.in);
        double a=in.nextDouble();
        double b=in.nextDouble();
        double c=a/b;
        System.out.println("the answer"+c);
        int[] arr=new int[3];
        arr[5]=25;
    }catch(ArithmeticException e){
        System.out.println(e);
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e);
    }
    }

}
