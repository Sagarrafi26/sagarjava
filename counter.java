class counter1{
    static int count;
    counter1(){
        count++;
    }
    public void Display(){
        System.out.println("the count of the object "+count);

    }
}
public class counter {
    public static void main(String[] args){
        counter1 c1=new counter1();
        c1.Display();
        counter1 c2=new counter1();
        c2.Display();
    }
    
}
