import java.util.Scanner;

class nestedSwitch{


    public static void main(String[] args){

        int case1 = 2;
        int case2 = 2;

        switch (case1) {
            case 1:

                switch(case2){
                    case 1:
                        System.out.println("inside case1 1 ");
                    break;
                    case 2:
                        System.out.println("inside case1 2 ");
                    break;
                }
                
            break;
            case 2:

                switch(case2){
                    case 1:
                        System.out.println("inside case2 1 ");
                    break;
                    case 2:
                        System.out.println("inside case2 2 ");
                    break;
                }

            break;
            default:
                break;
        }

    }


}