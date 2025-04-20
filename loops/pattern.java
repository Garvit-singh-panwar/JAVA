package loops;

import java.util.Scanner;

public class pattern{

    public static void ptrn(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*"); // print without newline
            }
            System.out.println(); // move to next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of pyramid:");

        int length = sc.nextInt();

        ptrn(length);

        sc.close();
    }
}