package compare;
import java.util.*;
class Employee{
    String name;
    int age;
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Agecomparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1=(Employee)o1;
        Employee e2=(Employee)o2;
        if(e1.age==e2.age){
            return 0;
        }
        else if(e1.age>e2.age){
            return 1;
        }
        else{
            return -1;
        }
    }
}


class Namecomparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Employee e3=(Employee)o1;
        Employee e4=(Employee)o2;
       return(e3.name.compareTo(e4.name));
        


    }

}



public class comparatorexam {
    public static void main(String[] args){
        Employee e1=new Employee("sagar",21);
        Employee e2=new Employee("karim",31);
        Employee e3=new Employee("bharath",27);
        Employee e4=new Employee("reena",6);
        ArrayList<Employee> aa=new ArrayList<Employee>();
        aa.add(e1);
        aa.add(e2);
        aa.add(e3);
        aa.add(e4);
        Collections.sort(aa,new Agecomparator());
        for(Employee em:aa){
            System.out.println(em.age+" "+em.name);
        }
        System.out.println("-------");
         Collections.sort(aa,new Namecomparator());
        for(Employee em:aa){
            System.out.println(em.age+" "+em.name);
        }

    }
    
}
