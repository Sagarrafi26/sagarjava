package polymorphism;
class Box{
    double width;
    double height;
    double length;
    Box(){
        width=3.1;
        height=4.5;
        length=6.4;
    }
    Box(double len){
        width=height=length=len;
    }
Box(double width,double height,double length){
    this.width=width;
    this.height=height;
    this.length=length;

}
public void volume(){
    double vol=width*height*length;
    System.out.println("volume of box "+vol);
}
}




public class constructoroverloading {
    public static void main(String[] args){
        Box b=new Box();
        b.volume();
        Box b2=new Box(2.0);
        b2.volume();
        Box b3=new Box(2,3,4);
        b3.volume();
    }
    
}
