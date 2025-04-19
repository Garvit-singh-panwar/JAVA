import java.util.Scanner;

public class isLeap{

    public static void isLeap(short days){

        if(days == 365){
            System.out.println("not a leap year");
        }
        else if(days == 366){
            System.out.println("its a leap year");
        }
        else{
            System.out.println(" year do not have "+days  +" number of days ");
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of days in this year ");

        short days = sc.nextShort();

        isLeap(days);

    }

}