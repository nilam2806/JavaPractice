package Collection.ArrayListExamples;

import java.util.ArrayList;

public class CreateArrayList {
	public static void main(String[] args) {
		// Creating an ArrayList of String
		ArrayList<String> Flowers = new ArrayList<String>();

		// Adding new elements to the ArrayList
		Flowers.add("Rose");
		Flowers.add("Lotus");
		Flowers.add("sunflower");
		Flowers.add("Merigold");
		Flowers.add("sunflower");
		Flowers.add(null);

		System.out.println(Flowers);

		// Adding an element at a particular index in an ArrayList

		Flowers.add(2, "Red rose");

		System.out.println(Flowers);
	}

}
