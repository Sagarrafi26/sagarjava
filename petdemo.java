class Dogs{
     String breed;
     String color;
     int age;
     public String getinfo(){
        return("the breed is "+breed+" "+"the age is "+age+" "+"the color is "+color);
       }
}

public class petdemo {
      public static void main(String[] args){
        Dogs labrador=new Dogs();
        labrador.breed="labrador";
        labrador.color="brown";
        labrador.age=2;
        String pet_details=labrador.getinfo();
        System.out.println("The details of dog "+pet_details);
}

}
