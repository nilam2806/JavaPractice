package Collection.ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayList {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Nisha");
		names.add("Arush");
		names.add("Yash");
		names.add("Riya");
		names.add("Priya");
		

        // Check if an ArrayList contains a given element
		System.out.println("Does names array contains \"Riya\"? : " +names.contains("Riya"));
		
        // Find the index of the first occurrence of an element in an ArrayList
		System.out.println("index of \"Arush\": " +names.indexOf("Arush"));
		System.out.println("index of \"Priya\": " +names.indexOf("Rutu"));
		
		
        // Find the index of the last occurrence of an element in an ArrayList
		System.out.println("last index of \"Yash\": " +names.lastIndexOf("Yash"));
		System.out.println("last index of \"Aish\": " +names.lastIndexOf("Aish"));


	}

}
