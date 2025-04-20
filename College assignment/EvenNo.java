import java.util.Scanner;

class EvenNo{

        public static void PrintEvenNo(){
            Scanner sc = new Scanner(System.in);

            int To = sc.nextInt();
            System.out.print("Enter no");
            for(int i = 2 ; i <= To ; i+=2){

                System.out.println(i);

            }

        }
        public static void main(String[] args){

            PrintEvenNo();

        }


}