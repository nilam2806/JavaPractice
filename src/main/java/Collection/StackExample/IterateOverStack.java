package Collection.StackExample;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class IterateOverStack {
	public static void main(String[] args) {

		Stack<String> stackOfPlates = new Stack<>();

		stackOfPlates.push("plate 1");
		stackOfPlates.push("plate 2");
		stackOfPlates.push("plate 3");
		stackOfPlates.push("plate 4");
		stackOfPlates.push("plate 5");

		System.out.println("Initial Stack => " + stackOfPlates);

		System.out.println("=== Iterate over a Stack using Java 8 forEach() method ===");
		stackOfPlates.forEach(plates -> {
			System.out.println(plates);
		});

		System.out.println("\n=== Iterate over a Stack using iterator() ===");
		Iterator<String> platesIterator = stackOfPlates.iterator();
		while (platesIterator.hasNext()) {
			String plate = platesIterator.next();
			System.out.println(plate);
		}

		System.out.println("\n=== Iterate over a Stack using iterator() and Java 8 forEachRemaining() method ===");
		platesIterator = stackOfPlates.iterator();
		platesIterator.forEachRemaining(plate -> {
			System.out.println(plate);
		});

		System.out.println("\n=== Iterate over a Stack from TOP to BOTTOM using listIterator() ===");
		// ListIterator allows you to traverse in both forward and backward directions.
		// We'll start from the top of the stack and traverse backwards.
		ListIterator<String> platesListIterator = stackOfPlates.listIterator(stackOfPlates.size());
		while (platesListIterator.hasPrevious()) {
			String plate = platesListIterator.previous();
			System.out.println(plate);
		}

	}

}
