import java.util.Scanner;

public class kmToMiles {

    public static void miles(float km){
        System.out.println(km*0.62);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter km");
        float km = sc.nextFloat();
        miles(km);
    }
}
