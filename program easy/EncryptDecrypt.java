import java.util.Scanner;

public class EncryptDecrypt{

    public static char Encrypt(char grade){
        return (char)( grade + 8);
    }
    public static char Decrypt(char  grade){
        return (char)( grade - 8);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Grade");

        char grade = Encrypt(sc.next().charAt(0));

         System.out.println("Encrypted grade is " + grade);

        grade = Decrypt(grade);
        
        System.out.println("Decrypted grade is " + grade);

    }

}