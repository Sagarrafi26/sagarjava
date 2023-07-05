package sagaaaa.Stringexamples;

public class reversestring {
    public static void main(String[] args){
    String s2="Prabhas";
        char[] ar=s2.toCharArray();
        int size=ar.length;
        char[] reverse=new char[size];
        int i=0;
        while(i != size){
            reverse[size-i-1]=ar[i];
            i++;
        }
        System.out.println(reverse);
    }
}
