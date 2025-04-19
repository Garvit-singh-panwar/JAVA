import java.util.Scanner;

public class webFromUrl {

    public static void Check_Webtype(String URL){
        switch(URL){
            case ".com":
                System.out.println("It's a Commercial website");
            break;
            case ".org":
                System.out.println("It's a Organizational website");
            break;
            case ".in":
                System.out.println("It's a Indian website");
            break;
            default:
                System.out.println("Information not available check other");
            break;
        }   
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter url of the link");

        String URL = sc.next();

        Check_Webtype(URL);

    }
}
