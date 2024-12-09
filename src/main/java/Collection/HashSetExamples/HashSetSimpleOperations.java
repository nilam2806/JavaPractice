package Collection.HashSetExamples;

import java.util.HashSet;
import java.util.Set;

public class HashSetSimpleOperations {
	public static void main(String[] args) {
		Set<String> popularCities = new HashSet<>();

		// Check if a HashSet is empty
		System.out.println("Is popular cities set is empty? :" + popularCities.isEmpty());

		popularCities.add("London");
		popularCities.add("New York");
		popularCities.add("Paris");
		popularCities.add("Dubai");

		// Find the size of a HashSet
		System.out.println("Number of cities in the hashset: " + popularCities.size());

		// Check if the HashSet contains an element
		String cityName = "Paris";
		if (popularCities.contains(cityName)) {
			System.out.println(cityName + " is in the popular city set");

		} else {
			System.out.println(cityName + " is not in the popular city set");
		}
	}

}
