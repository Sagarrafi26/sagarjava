package sagaaaa.Stringexamples;
import java.util.Scanner;
public class Stringlength {
    public static void main(String[] args){
        System.out.println("enter the string ");
        Scanner in =new Scanner(System.in);
        String s1=in.nextLine();
        char[] arr=s1.toCharArray();
        int i=0;
        for( char c:arr){
            i++;
        } 
        System.out.println("the length of the string "+i);
    }
    
}
