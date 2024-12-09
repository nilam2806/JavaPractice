package Collection.ArrayListExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorRemove {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();

		numbers.add(14);
		numbers.add(20);
		numbers.add(35);
		numbers.add(9);

		Iterator<Integer> numbersIterator = numbers.iterator();
		while (numbersIterator.hasNext()) {
			Integer num = numbersIterator.next();
			if (num % 2 != 0) {
				numbersIterator.remove();
			}
		}

		System.out.println(numbers);
	}

}
