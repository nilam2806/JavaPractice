package Collection.HashSetExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetRemove {
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<Integer>();

		numbers.add(2);
		numbers.add(4);
		numbers.add(23);
		numbers.add(34);
		numbers.add(21);
		numbers.add(56);
		numbers.add(67);
		numbers.add(78);
		numbers.add(89);

		System.out.println("Numbers: " + numbers);

		// Remove an element from a HashSet (The remove() method returns false if the
		// element does not exist in the HashSet)
		boolean isRemoved = numbers.remove(34);
		System.out.println("After remove(34): " + numbers);

		// Remove all elements belonging to a given collection from a HashSet
		List<Integer> perfectSquqares = new ArrayList<>();
		perfectSquqares.add(4);
		perfectSquqares.add(16);

		numbers.removeAll(perfectSquqares);
		System.out.println("After removing perfect squares: " + numbers);

		// Remove all elements matching a given predicate
		numbers.removeIf(num -> num % 2 == 0);
		System.out.println("After removeif : " + numbers);

		// Remove all elements from HashSet (clear it completely)
		numbers.clear();
		System.out.println("After clear: " + numbers);
	}
}
