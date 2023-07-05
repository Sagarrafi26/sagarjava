package sagaaaa.Stringexamples;

public class stringtoanother {
     public static void main(String[] args){
        String s1="Prabhas";
        char[] a=s1.toCharArray();
        int size=a.length;
        char[] newarr=new char[size];
        int i=0;
        while(i != size){
            newarr[i]=a[i];
            i++;
        }
        System.out.println(newarr);
     }    
}
