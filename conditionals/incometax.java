import java.util.Scanner;
public class incometax{

    public static void taxslab(long income){

        if(income < 250000){
            System.out.println("you have to pay no tax");
        }
        else if(income < 500000){
            System.out.println("you have to pay 5% tax");
        }
        else if(income < 1000000){
            System.out.println("you have to pay 20% tax");
        }
        else{
            System.out.println("you have to pay 30% tax");
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Annual income");

        long  income = sc.nextLong();

        taxslab(income);

    }

}