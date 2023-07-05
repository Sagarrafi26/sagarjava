package sagaaaa;
class Employees{
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class writeonly {
    public static void main(String[] args){
        Employees e=new Employees();
        e.setSalary(2000);
    }
    
}
