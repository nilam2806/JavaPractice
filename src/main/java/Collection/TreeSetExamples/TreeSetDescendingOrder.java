package Collection.TreeSetExamples;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDescendingOrder {
	public static void main(String[] args) {
		
        // Creating a TreeSet with a custom Comparator (Descending  Order)

		SortedSet<String> fruits = new TreeSet<>(Comparator.reverseOrder());
		
		/*
        The above TreeSet with the custom Comparator is the concise form of the following:
        SortedSet<String> fruits = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });
    */
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Strawberry");
		fruits.add("Mango");

		System.out.println("Fruits set: " +fruits);
	}
}
