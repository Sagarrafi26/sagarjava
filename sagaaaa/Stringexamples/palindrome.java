package sagaaaa.Stringexamples;

public class palindrome {
     public static void main(String[] args){
    String s3="Prabhas";
        char[] ar=s3.toCharArray();
        int size=ar.length;
        char[] reverses=new char[size];
        int i=0;
        while(i != size){
            reverses[size-i-1]=ar[i];
            i++;
        }
        int j=0;
        while(j!=size){
            if(reverses[j]!=size){

                System.out.println("Not a palindrome");

                System.exit(0);
            }
            else{
                ++j;
                continue;
            }
                System.out.println("its  a palindrome "+s3);
            
        }
     }
    
}
