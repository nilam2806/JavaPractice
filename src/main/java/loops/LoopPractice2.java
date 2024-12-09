package loops;

import java.util.Scanner;

public class LoopPractice2 {
    //Factorial of a number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of a number is: " + fact);
    }


    //Sum of n natural numbers
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("The sum of " + n + " number is: " + sum);
    }*/


    //Multiplication table
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(n + " X " + i + " = " + n * i);
        }
    }*/

}
 