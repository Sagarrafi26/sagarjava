class A{
    int i;
    int j;
     public static void main(String []args){
        B b=new B();
        b.display();
    }
} 
class B extends A{
    int i;
    public void display(){
        i=30;
        j=40;
        super.i=20;
        System.out.println("thevalue of i in sub class "+i);
        System.out.println("thevalue of j in sub class "+j);
        System.out.println("thevalue of i in super class "+super.i);
        
       
    
    }
}
  
public class Superexample{
    
}
