class Animal{
    public void eat(){
        System.out.println("the animals are eating");
    }
    public void sleep(){
        System.out.println("the animals are sleeping");

    } 
}
class Dog extends Animal{
    public void bark(){
        System.out.println("dogs are barking");
    }
}

public class inheritance {
    public static void main(String[] args){
        Dog d=new Dog();
        d.bark();
        d.eat();
        d.sleep();

    }
    
}
