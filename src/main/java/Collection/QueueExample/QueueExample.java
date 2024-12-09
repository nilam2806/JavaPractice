package Collection.QueueExample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		// Create and initialize a Queue using a LinkedList
		Queue<String> waitingQueue = new LinkedList<>();

		// Adding new elements to the Queue (The Enqueue operation)
		waitingQueue.add("David");
		waitingQueue.add("Janice");
		waitingQueue.add("John");
		waitingQueue.add("Chris");
		waitingQueue.add("Mark");

		System.out.println("waitingQueue => " + waitingQueue);

		// Removing an element from the Queue using remove() (The Dequeue operation)
		// The remove() method throws NoSuchElementException if the Queue is empty

		String name = waitingQueue.remove();
		System.out.println("removed from waitingQueue : " + name + "\nnew waitingQueue => " + waitingQueue);

		// Removing an element from the Queue using poll()
		// The poll() method is similar to remove() except that it returns null if the Queue is empty.
		
		name = waitingQueue.poll();
		System.out.println("removed from waitingQueue : " + name + "\nnew waitingQueue => " +waitingQueue);
	}

}
