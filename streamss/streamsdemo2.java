package streamss;
import java.util.*;
import java.util.stream.Collectors;
class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}

public class streamsdemo2 {
    public static void main(String[] args){
        ArrayList<Product> pl=new ArrayList<Product>();
        pl.add(new Product(1,"HP",25000f));
         pl.add(new Product(2,"dell",30000f));
          pl.add(new Product(3,"one plus",50000f));
           pl.add(new Product(4,"iphone",80000f));
           List<Float>productlistprice=pl.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
           System.out.println(productlistprice);
    }
    
}
