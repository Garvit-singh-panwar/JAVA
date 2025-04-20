import java.util.Scanner;


class Compare{

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int random =(int)(Math.floor(Math.random()*10));
        System.out.println("enter no to check no is same as generated or not");
        int no = sc.nextInt();

        if(no == random){
            System.out.println("no is same as genereted");
        }else{
            System.out.println("no is not same as generated");
        }


    }

}