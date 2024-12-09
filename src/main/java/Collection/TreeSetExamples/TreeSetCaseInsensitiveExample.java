package Collection.TreeSetExamples;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetCaseInsensitiveExample {
	public static void main(String[] args) {
        // Creating a TreeSet with a custom Comparator (Case Insensitive Order)
		SortedSet<String> fruits = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		
		/*
        The above TreeSet with the custom Comparator is the concise form of the following:
        SortedSet<String> fruits = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        });
    */
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Strawberry");
		fruits.add("Mango");

		System.out.println("Fruits set: " +fruits);
		
		
        // Now, lowercase elements will also be considered as duplicates
		fruits.add("banana");
		System.out.println("after adding the duplicate element \"banana\": " +fruits);
		

	}
}
