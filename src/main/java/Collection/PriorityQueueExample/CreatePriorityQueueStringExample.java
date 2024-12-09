package Collection.PriorityQueueExample;

import java.util.PriorityQueue;

public class CreatePriorityQueueStringExample {

	public static void main(String[] args) {

		PriorityQueue<String> namePriorityQueue = new PriorityQueue<>();

		namePriorityQueue.add("David");
		namePriorityQueue.add("Janice");
		namePriorityQueue.add("John");
		namePriorityQueue.add("Chris");
		namePriorityQueue.add("Mark");

		System.out.println("Name PriorityQueue => " +namePriorityQueue);
		
		// Remove items from the Priority Queue (DEQUEUE)
		while (!namePriorityQueue.isEmpty()) {
			System.out.println(namePriorityQueue.remove());
		}

	}
}
