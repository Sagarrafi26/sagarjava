class Animal1{
    String color="white";

}
class Dog1 extends Animal1{
    String color="black";
    public void show(){
        System.out.println("the color of animal is "+super.color);
        System.out.println("the color of the dog "+color);
    }
}



public class Superclass {
    public static void main(String[] args){
        Dog1 d=new Dog1();
        d.show();
    }
      
}
