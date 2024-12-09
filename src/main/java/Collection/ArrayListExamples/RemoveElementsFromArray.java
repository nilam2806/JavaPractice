package Collection.ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArray {
	
	public static void main(String[] args) {
		
		List<String> programmingLanguages = new ArrayList<String>();
		
		programmingLanguages.add("C");
		programmingLanguages.add("Java");
		programmingLanguages.add("HTML");
		programmingLanguages.add("CSS");
		programmingLanguages.add("Kotlin");
		programmingLanguages.add("Python");
		programmingLanguages.add("Pearl");
		
		System.out.println("Initial list:" +programmingLanguages);
		
		// Remove the element at index `2`
		programmingLanguages.remove(2);
		System.out.println("After removal(2): " +programmingLanguages);


		// Remove the first occurrence of the given element from the ArrayList
        // (The remove() method returns false if the element does not exist in the ArrayList)
		
		boolean isRemove = programmingLanguages.remove("Kotlin");
		System.out.println("After removal \"Kotlin\": " +programmingLanguages);

		// Remove all the elements that exist in a given collection
		List<String> scriptingLanguages = new ArrayList<String>();
		
		scriptingLanguages.add("Python");
		scriptingLanguages.add("Pearl");
		
		
		programmingLanguages.removeAll(scriptingLanguages);
		System.out.println("after removal scriptingLanguages: " + programmingLanguages);
	}

}
