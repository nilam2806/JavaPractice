package loops;

import java.util.Scanner;

public class Palindrome {

    //Check a number is Palindrome
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int rev = 0, r;
        int m = n;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        if (m == rev) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
    //Reverse number
   /* public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        int rev = 0, r;

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        System.out.println("Reverse of number: " + rev);
    }*/
}
