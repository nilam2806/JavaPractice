package Collection.PriorityQueueExample;

import java.util.PriorityQueue;

public class CreatePriorityQueueExample {
	public static void main(String[] args) {

		PriorityQueue<Integer> numbers = new PriorityQueue<>();

		numbers.add(750);
		numbers.add(100);
		numbers.add(900);
		numbers.add(500);
		numbers.add(350);

		System.out.println("Numbers PriorityQueue => " +numbers);

		// Remove items from the Priority Queue (DEQUEUE)
		System.out.println("Removed Numbers:");
		while (!numbers.isEmpty()) {
			System.out.println(numbers.remove());
		}
	}
}
