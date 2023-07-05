
class Employee{
    private String name;
    private int ssn;
    private double salary;
    public void setName(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    
    public int getSsn() {
        return ssn;
    }
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}




public class Encapsulation {
    public static void main(String[] args){
        Employee e = new Employee();
        e.setName("sagar");
        e.setSalary(25000);
        e.setSsn(221);
        String name=e.getName();
        System.out.println("the name of employee "+name);
        double salary=e.getSalary();
        System.out.println("the salary of employee "+salary);
        int ssn=e.getSsn();
        System.out.println("the ssn of employee "+ssn);

    }
    
}


