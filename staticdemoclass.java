class Employee{
    String empname;
    int empid;
    static String company="Technoforte";
    Employee(String empname,int empid){
        this.empname=empname;
        this.empid=empid;
    }
    public void Display(){
        System.out.println("the name of the employee "+empname+" "+"the id is "+empid+" "+"the company is "+company);
    }
}

public class staticdemoclass {
    public static void main(String[]args){
        Employee e1=new Employee("sagar",2);
        e1.Display();
        Employee e2=new Employee("jai",6);
        e2.Display();
    }
}
