package Collection.ArrayListExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCollectionsSort {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(23);
		numbers.add(45);
		numbers.add(67);
		numbers.add(98);
		numbers.add(2);

		System.out.println("Before sorting: " + numbers);

		// Sorting an ArrayList using Collections.sort() method
		Collections.sort(numbers);

		System.out.println("After sorting: " + numbers);

	}
}
