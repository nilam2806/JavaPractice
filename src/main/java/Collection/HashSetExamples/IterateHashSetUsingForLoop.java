package Collection.HashSetExamples;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSetUsingForLoop {
	public static void main(String[] args) {
		
		
		// Creating a new HashSet for iteration 
		HashSet<String> set = new HashSet<>();
		
		//add elements
		set.add("Nilam");
		set.add("Nisha");
		set.add("Ashu");
		set.add("Abhi");
		
		
		// Duplicates not allowed in HashMap, so avoid by HashMap 
	    
		set.add("Abhi");
		
		System.out.println(set);

        // Iterate through a simple for loop 
		for(String name:set) { //Type is String, because the HashSet contains String elements.
			                   //variable is name, which will take on the value of each element in the set during each iteration.
			
			System.out.println(name+ "");
			
			
		}
	}
		
}
