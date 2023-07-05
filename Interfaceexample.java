interface Printtable{
    public void print();

}

public class Interfaceexample implements Printtable {

    @Override
    public void print() {
        System.out.println("method overridden by the implementation class");
    }
    public static void main(String[] args){
        Interfaceexample ie =new Interfaceexample();
        ie.print();

    }
    
}
