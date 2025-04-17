import java.util.Scanner;

public class CheckInt{


    // check wheter the no is int or not
public static void checkInt(){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");

    
    if(sc.hasNextInt()){
        int num = sc.nextInt();
        System.out.println("its an integer");
    }
    else{
        System.out.println("its not an integer");
    }
   
}

    public static void main(String[] args){

        checkInt();

        
    }

} 