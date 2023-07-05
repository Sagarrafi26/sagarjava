import java.util.ArrayList;
import java.util.Iterator;
class Student{
   public int rollno;
  public  String name;
public double marks;
  public Student(int rollno, String name, double marks) {
    this.rollno = rollno;
    this.name = name;
    this.marks = marks;
}
public int getrollno(){
    return rollno;
}
public String getname(){
    return name;
}
public double getmarks(){
    return marks;
}
}

public class arraycollections {
    public static void main (String[] args){
        ArrayList<Student> at=new ArrayList<Student>();
        Student s1=new Student(1,"sagar",25);
        Student s2=new Student(2,"rafi",24);
        at.add(s1);
        at.add(s2);
        Iterator it=at.iterator();
        while(it.hasNext()){
            Student s=(Student)it.next();
            System.out.println(s.getrollno());
            System.out.println(s.getname());
            System.out.println(s.getmarks());
        }

    }
}
