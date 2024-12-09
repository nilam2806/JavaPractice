package Collection.LinkedListExamples;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateOverLinkedList {
	public static void main(String[] args) {
		LinkedList<String> gameTypes = new LinkedList<String>();

		gameTypes.add("football");
		gameTypes.add("cricket");
		gameTypes.add("caram");
		gameTypes.add("hockey");

		System.out.println("=== Iterate over a LinkedList using Java 8 forEach and lambda ===");
		gameTypes.forEach(game -> {
			System.out.println(game);
		});

		System.out.println("\n=== Iterate over a LinkedList using iterator() ===");
		Iterator<String> gameTypesIterator = gameTypes.iterator();
		while (gameTypesIterator.hasNext()) {
			String games = gameTypesIterator.next();
			System.out.println(games);
		}

		System.out.println("\n=== Iterate over a LinkedList using iterator() and Java 8 forEachRemaining() method ===");
		gameTypesIterator = gameTypes.iterator();
		gameTypesIterator.forEachRemaining(games -> {
			System.out.println(games);
		});

		System.out.println("\n=== Iterate over a LinkedList using descendingIterator() ===");
		Iterator<String> descedendinggameTypesIterator = gameTypes.descendingIterator();
		while (descedendinggameTypesIterator.hasNext()) {
			String games = descedendinggameTypesIterator.next();
			System.out.println(games);
		}

		System.out.println("\n=== Iterate over a LinkedList using listIterator() ===");
		ListIterator<String> gameTypesListIterator = gameTypes.listIterator(gameTypes.size());
		while (gameTypesListIterator.hasPrevious()) {
			String games = gameTypesListIterator.previous();
			System.out.println(games);
		}

		System.out.println("\n=== Iterate over a LinkedList using simple for-each loop ===");
		for (String games : gameTypes) {
			System.out.println(games);
		}
	}

}
