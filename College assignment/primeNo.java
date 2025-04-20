import java.util.Scanner;



public class primeNo{



    public static boolean isPrime(int n){

        for(int i = 2 ; i <= n/2 ; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    
    public static void primeNoBtwn(int no){

        for(int i = 0 ; i <= no ; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();

        primeNoBtwn(no);


    }



}