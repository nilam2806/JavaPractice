package operators;

import java.util.Scanner;

public class CuboidArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int height, breadth, length;
		double totalArea, volume;

		System.out.println("Enter the length, breadth and height: ");
		length = sc.nextInt();
		breadth = sc.nextInt();
		height = sc.nextInt();

		totalArea = 2 * ((length * breadth) + (length * height) + (breadth * height));

		volume = length * breadth * height;

		System.out.println("Total area of cuboid is:" + totalArea);
		System.out.println("Volume is: " + volume);

	}

}
