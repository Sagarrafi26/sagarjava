class Boxes{
    double length;
    double width;
    double height;
    Boxes(double l,double b,double h){
        length=l;
        width=b;
        height=h;
    }
}
class Boxw extends Boxes{
    double weight;
    Boxw(double l,double b,double h,double w){
        super(l,b,h);
        weight=w;
    }
    public void Volume(){
        double Vol=length*width*height;
        System.out.println("The volume of the box "+Vol);
        System.out.println("the weight of box"+weight);
    }
}


public class Superconstructor {
    public static void main(String[] args){
        Boxw bx=new Boxw(2,45,25,34.5);
        bx.Volume();
    }
    
}
