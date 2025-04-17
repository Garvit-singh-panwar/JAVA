import java.util.Scanner;

public class detectSpace{

    public static void detectSpace(String str){

        if(str.contains("   ")){
            System.out.println("it contains tripple space");
        }

        else if(str.contains("  ")){
            System.out.println("it contains DoubleSpace");
        }
        else if(str.contains(" ")){
            System.out.println("it contains Single Space");
        }
         
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String toDetect = "detect   the space";
        detectSpace(toDetect);
    }

}