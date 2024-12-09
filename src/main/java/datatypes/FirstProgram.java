package datatypes;

import java.util.Scanner;

public class FirstProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int c = a+b;
		
		System.out.println("Sum is "+c);
	}
}
