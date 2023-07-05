class Student{
    String name;
    int rollno;
    double marks;
    Student(String name,int rollno,double marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
}

public class studentdemo {
    public static void main(String[] args){

    
        Student[] st=new Student[2];
        st[0]=new Student("sagar",19,88.9);
        st[1]=new Student("prabhas",20,99.9);
        for(Student s:st){
            System.out.println("the name of the student "+s.name + " the roll no is "+s.rollno + " marks are "+s.marks);
        }
        
    }
}
