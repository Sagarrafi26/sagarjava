package compare;
import java.util.*;
import java.util.Iterator;
class Student implements Comparable<Student>{
    public String name;
    public int age;
    

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Student o) {
        if(this.age==o.age){
            return 0;
        }
        else if(this.age>o.age){
            return 1;
        }
        else{
            return -1;
        }
    }

}
public class comparable {
    public static void main(String[] args){
        Student s1=new Student("Sagr",21);
        Student s2=new Student("reena",5);
        Student s3=new Student("anwar",9);
        ArrayList<Student> a=new ArrayList<Student>();
        a.add(s1);
        a.add(s2);
        a.add(s3);
        System.out.println("before string");
        Iterator er=a.iterator();
        while(er.hasNext()){
            Student st=(Student)er.next();
            System.out.println(st.name+" "+st.age);
        }
        Collections.sort(a);
        Iterator ers=a.iterator();
        while(ers.hasNext()){
            Student st=(Student)ers.next();
            System.out.println(st.name+" "+st.age);


    }
    
}
}

