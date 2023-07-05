package methodoverloading;

public class overloading {
    public static void area(int side){
        int square_area=side*side;
        System.out.println("the area of a square "+square_area);
    }
    public static void area(int length,int breadth){
        int rectangle_area=length*breadth;
        System.out.println("the area of rectangle "+rectangle_area);
    }
    public static void main(String [] args){
        area(5);
        area(2,5);
        Overdemo o=new Overdemo();
        o.m1(2,6);
        o.m1(2.5f,10.5f);
    }
}
class Overdemo{
    public void m1(int i,int j){
        System.out.println("integer argument "+i+" "+j);
    }
    public void m1(float j,float k){
        System.out.println("float arguments are "+j+' '+k);
    }
}
