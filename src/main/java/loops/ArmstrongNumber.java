package loops;

import java.util.Scanner;

public class ArmstrongNumber {

    //Finding a number is Armstrong or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int m = n;
        int sum = 0;
        int r;

        while (n > 0) {
            r = n % 10;
            n = n / 10;

            sum = sum + r * r * r;

        }
        if (sum == m) {
            System.out.println("Its a Armstrong number");
        } else {
            System.out.println("Its not a Armstrong number");
        }
    }


    //Count digits of a number
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Count of number is: "+count);
    }*/


    //Display digits of number
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int r;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            System.out.println(r);
        }
        System.out.println(n);
    }*/
}
