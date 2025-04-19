import java.util.Scanner;

public class passOrFail{

    public static void isPass(int percentage){
        if(percentage < 28){
            System.out.println("Fail");
        }
        else if(percentage < 100 ){
            System.out.println("pass");
        }
        else{
            System.out.println("enter correct percentage");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter percentage ");
        int percentage = sc.nextInt();

        isPass(percentage);




    }
}