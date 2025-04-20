import java.util.Scanner;

class Fibonachi{

    public static void fibonachi(){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no whose fibonaci no you want");

        int no = sc.nextInt();

        int fibonachino = 0;

        int first = 0;
        int second = 1;
        

        for(int i = 2 ; i <= no ; i++ ){
            
            fibonachino =  first + second ; 
            
            first = second ;
            second = fibonachino;
        }
        System.out.println(fibonachino);

    }

    public static void main(String[] args){
    fibonachi();

    }

}