package polymorphism;
class Shape{
    public void draw(){
        System.out.println("drawing Shapes");
    }
}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("drawing rectangles");
    }

}
class Triangle extends Shape{
    public void draw(){
        System.out.println("drawing Triangle");
    }
}

public class runtimepoly {
    public static void main(String[] args){
        Shape s;
        s=new Shape();
        s.draw();
        s=new Rectangle();
        s.draw();
        s=new Triangle();
        s.draw();

    }
    
}
