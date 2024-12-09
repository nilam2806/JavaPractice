package Collection.QueueExample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSizeSearchFrontExample {
 
	public static void main(String[] args) {
		Queue<String> waitingQueue = new LinkedList<>();
		
		waitingQueue.add("Jennifer");
		waitingQueue.add("David");
		waitingQueue.add("Janice");
		waitingQueue.add("Angelina");
		
		System.out.println("waitingQueue => " + waitingQueue);
		
        // Check if a Queue is empty
		System.out.println("is waitingQueue empty? :" +waitingQueue.isEmpty());
		
		
        // Find the size of the Queue
		System.out.println("size of waitingQueue is:" + waitingQueue.size());

		String name = "Janice";
		if (waitingQueue.contains(name)) {
			System.out.println("waitingQueue contians " + name);
			
		}else {
			System.out.println("waitingQueue does not contain " +name);
		}
		
		 // Get the element at the front of the Queue without removing it using element()
        // The element() method throws NoSuchElementException if the Queue is empty
		
		String firstPersonInWaitingQueue = waitingQueue.element();
		System.out.println("First person in the waitingQueue(Element()) : " +firstPersonInWaitingQueue);
		
		
		 // Get the element at the front of the Queue without removing it using peek()
        // The peek() method is similar to element() except that it returns null if the Queue is empty
		
		firstPersonInWaitingQueue = waitingQueue.peek();
		System.out.println("First person in the waitingQueue : " +firstPersonInWaitingQueue);
	}
}
