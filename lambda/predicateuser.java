package lambda;
import java.util.function.Predicate;
import java.util.*;
class User{
    String username;
    String password;
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
 
}
public class predicateuser {
    public static void main(String[] args){
        Predicate<User> p=u->u.username.equals("sagar")&&u.password.equals("Sagar@143");
        System.out.println("enter the username and password");
        Scanner in =new Scanner(System.in);
        System.out.println("enter the username");
        String username=in.next();
         System.out.println("enter the passwpord");
        String password=in.next();
        User user=new User(username,password);
        if(p.test(user)){
            System.out.println("WELCOME TO TECHNOFORTE");
        }
        else{
            System.out.println("Recheck");
        }

    }
    
}
