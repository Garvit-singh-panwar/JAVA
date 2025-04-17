import java.util.Scanner;

public class greet {

    public static void greet(String user){
        System.out.println("hello " + user);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your NameGa");
        String user = sc.next();
        greet(user);
    }
    
}
