package conditionalstatement;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {

		/* Find Odd Even */

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number: ");
//		int n = sc.nextInt();
//
//
//		if (n % 2 == 0) {
//			System.out.println("Number is Even.");
//
//		} else {
//			System.out.println("Number is Odd.");
//		}
		
		
		
		
		

		/* Find person is young or not */

//		int age;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the age:");
//		age=sc.nextInt();
//		
//		if (age>=16 && age<=50) {
//			System.out.println("Person is young.");
//			
//		}else {
//			System.out.println("Person is not young.");
//		}
		
		
		
		
		
		
		
		
		
		
		
		

		/* Find grades for given marks */

		int m1, m2, m3;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks:");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();

		int total = m1 + m2 + m3;
		System.out.println("Total marks:" + total);

		float avg = (float) (m1 + m2 + m3) / 3;
		System.out.println("Average of marks:" + avg);

		if (avg >= 70) {
			System.out.println("Grade A");

		} else if (avg >= 60 && avg <= 70) {
			System.out.println("Grade B");

		} else if (avg >= 50 && avg <= 60) {
			System.out.println("Grade C");

		} else if (avg >= 40 && avg <= 50) {
			System.out.println("Grade D");

		} else {
			System.out.println("Grade E");
		}
	}
}
