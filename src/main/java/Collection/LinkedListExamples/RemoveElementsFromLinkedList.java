package Collection.LinkedListExamples;

import java.util.LinkedList;

public class RemoveElementsFromLinkedList {
	
	public static void main(String[] args) {
		LinkedList<String> programmingLanguages = new LinkedList<String>();
		
		programmingLanguages.add("Java");
		programmingLanguages.add("CPP");
		programmingLanguages.add("Fortran");
		programmingLanguages.add("C");
		programmingLanguages.add("JS");
		
        System.out.println("Initial LinkedList = " + programmingLanguages);
        
     // Remove the first element in the LinkedList
        String element = programmingLanguages.removeFirst();// Throws NoSuchElementException if the LinkedList is empty
		System.out.println("Removed the first element: " +element+ " => " +programmingLanguages);
		

      // Remove the last element in the LinkedList
		element = programmingLanguages.removeLast();// Throws NoSuchElementException if the LinkedList is empty
		System.out.println("Removed last element: "+ element + " => " +programmingLanguages);
	
		// Remove the first occurrence of the specified element from the LinkedList
		boolean isRemoved = programmingLanguages.remove("C#");
		if (isRemoved) {
			System.out.println("Removed: C# =>" + programmingLanguages);
		}
		
        // Remove all the elements that satisfy the given predicate
		programmingLanguages.removeIf(programmingLanguage -> programmingLanguage.startsWith("C"));
		System.out.println("Removed languages start with C => " +programmingLanguages);
	
        // Clear the LinkedList by removing all elements
		programmingLanguages.clear();
		System.out.println("Cleared the likedlist => " +programmingLanguages);
	}
       
	
}
