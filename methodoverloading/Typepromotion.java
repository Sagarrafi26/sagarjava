package methodoverloading;
class Demo{
    public void show(){
        System.out.println("no arguments");
    }
    public void show(int i){
        System.out.println("integer argumnets "+i);
    }
    public void show(double s){
        System.out.println("double arguments "+s);
    }
}

public class Typepromotion {
    public static void main(String[] args){
        Demo d =new Demo();
        d.show();
        d.show(2);
        d.show('s');
        d.show(10.5f);
    }
    
}
