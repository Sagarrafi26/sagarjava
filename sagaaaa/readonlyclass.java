package sagaaa;
class Student{
    private String college="Presidency";

    public String getCollege() {
        return college;
    }
    
}

public class readonlyclass {
    public static void main(String[] args){
        Student s=new Student();
        String college=s.getCollege();
        System.out.println("the student clg is "+college);
    }
    
}
