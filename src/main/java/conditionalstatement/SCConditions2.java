package conditionalstatement;

import java.util.Scanner;

public class SCConditions2 {

	// Find the given year is leap or not
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the year:");
		int year = sc.nextInt();

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("Its a leap year");
				} else {
					System.out.println("Its not a leap year");
				}

			} else {
				System.out.println("Its a leap year");
			}
		} else {
			System.out.println("Its not a leap year");

		}
	}

	/*
	 * Find Radix of given number public static void main(String[] args) { Scanner
	 * sc = new Scanner(System.in); String num;
	 * 
	 * System.out.println("Enter String:"); num = sc.nextLine();
	 * 
	 * if (num.matches("[01]+")) {
	 * 
	 * System.out.println("Binary Radix=2");
	 * 
	 * } else if (num.matches("[0-7]+")) { System.out.println("Octal Radix=8");
	 * 
	 * } else if (num.matches("[0-9]+")) { System.out.println("Decimal Radix=10");
	 * 
	 * } else if (num.matches("[0-9A-F]+")) { System.out.println("Hexa Radix=16"); }
	 * else { System.out.println("Not a number"); } }
	 */
}
