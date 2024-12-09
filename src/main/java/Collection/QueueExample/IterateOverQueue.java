package Collection.QueueExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterateOverQueue {

	public static void main(String[] args) {

		Queue<String> waitingQueue = new LinkedList<>();

		waitingQueue.add("Janice");
		waitingQueue.add("David");
		waitingQueue.add("Jennifer");
		waitingQueue.add("Chris");

		System.out.println("waitingQueue :" + waitingQueue);

		System.out.println("=== Iterating over a Queue using Java 8 forEach() ===");
		waitingQueue.forEach(name -> {
			System.out.println(name);
		});

		System.out.println("\n=== Iterating over a Queue using iterator() ===");
		Iterator<String> waitingQueueIterator = waitingQueue.iterator();
		while (waitingQueueIterator.hasNext()) {
			String name = waitingQueueIterator.next();
			System.out.println(name);

		}

		System.out.println("\n=== Iterating over a Queue using iterator() and Java 8 forEachRemaining() ===");
		waitingQueueIterator = waitingQueue.iterator();
		waitingQueueIterator.forEachRemaining(name -> {
			System.out.println(name);
		});

		System.out.println("\n=== Iterating over a Queue using simple for-each loop ===");
		for (String name : waitingQueue) {
			System.out.println(name);
		}

	}
}
