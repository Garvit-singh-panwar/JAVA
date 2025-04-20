import java.util.Scanner;

class factorial{

    public static void factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no whose factorial you want");
        int no = sc.nextInt();

        int factorial = 1; 

        for(int i = 1 ; i <= no ; i++){
            factorial *= i;
        }
        System.out.println(factorial);

    }

    public static void main(String[] args){

            factorial();

    }

}