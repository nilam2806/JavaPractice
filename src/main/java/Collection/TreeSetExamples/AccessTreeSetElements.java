package Collection.TreeSetExamples;

import java.util.TreeSet;

public class AccessTreeSetElements {
	public static void main(String[] args) {
		
		TreeSet<String> players = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		
		players.add("Dhoni");
		players.add("Rohit");
		players.add("Ronaldo");
		players.add("Sachin");
		
		System.out.println("Players set: " +players);
		
        // Finding the size of a TreeSet
		System.out.println("Number of elements in the treeset: " +players.size());
		
        // Check if an element exists in the TreeSet
		String name = "Sachin";
		if (players.contains(name)) {
			System.out.println("Treeset contains the element " +name);
		}
		else {
			System.out.println("Treeset does not contains the element " +name);
		}
		
        // Navigating through the TreeSet
		System.out.println("First element: " +players.first());
		System.out.println("Last element: " +players.last());
		
		name= "Ronaldo";
		System.out.println("Element just greater than " +name+ ": " +players.higher(name));
		System.out.println("Element just lower than " +name+ ": " +players.lower(name));
	}

}
