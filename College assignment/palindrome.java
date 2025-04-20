import java.util.Scanner;

class palindrome{
        public static void palindrome(String str){
            int l = 0 ; int r = str.length()-1;
            while(l<=r){
                if( str.charAt(l) != str.charAt(r)){
                    System.out.println("Its not a palindrome");
                    return;
                }
                l++;
                r--;
            }

            System.out.println("its a  palindrome");
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println("Enter a string to check its a palindrome or not");
        palindrome( str);

    }

}