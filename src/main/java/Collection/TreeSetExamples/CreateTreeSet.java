package Collection.TreeSetExamples;

import java.util.SortedSet;
import java.util.TreeSet;

public class CreateTreeSet {
	public static void main(String[] args) {
		
		SortedSet<String> fruits = new TreeSet<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Strawberry");
		fruits.add("Mango");
		
		System.out.println("Fruits set: " +fruits);
		
		// Duplicate elements are ignored
		fruits.add("Mango");
		System.out.println("After adding duplicate element \"Mango\": " +fruits);
		
		
		// This will be allowed because it's in lowercase.
		fruits.add("banana");
		System.out.println("After adding duplicate element \"banana\": " +fruits);
		
		
	}
}
