package operators;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {

//		float height, base, area;
//		System.out.println("Enter base and height:");
//
//		Scanner sc = new Scanner(System.in);
//		base = sc.nextFloat();
//		height = sc.nextFloat();
//
//		// area = base * height/2;
//		area = base * height * 0.5f;
//
//		System.out.println("Area of triangle is: " + area);


		Scanner sc = new Scanner(System.in);

		int a, b, c;
		float s;
		double area;

		System.out.println("Enter 3 sides of triangle:");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		s = (a + b + c) / 2f;

		System.out.println("Value of s: " + s);

		area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		
		System.out.println("Area of triangle is: "+ area);

	}

}
