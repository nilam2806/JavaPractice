package Collection.HashSetExamples;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSetUsingIterator {
	public static void main(String[] args) {
		
	
	// Creating a new HashSet for iteration 
	HashSet<Integer> set = new HashSet<>();
	
	//add elements
	set.add(20);
	set.add(30);
	set.add(40);
	set.add(60);
	set.add(70);
	
	// Duplicates not allowed in HashMap, so avoid by HashMap 
    
	set.add(20);
	
	System.out.println(set);
	
	// Create a iterator of type integer to iterate 
    // HashSet 
	
	Iterator<Integer> itr = set.iterator();
	
	System.out.println("iterate HashSet using iterator:");
	
	while(itr.hasNext()) { //hasNext() method check whether HashSet has elements or not
		
		System.out.println(itr.next());  //Next() method access the data of HashSet, Use Next() method only one time after hasNext().
	}
	}	

}
