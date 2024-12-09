package Collection.StackExample;

import java.util.Stack;

public class StackSizeSearch {
	public static void main(String[] args) {
		
Stack<String> stackOfCards = new Stack<>();
		
		stackOfCards.push("Jack");
		stackOfCards.push("Queen");
		stackOfCards.push("King");
		stackOfCards.push("Ace");
		
		System.out.println("Stack => " +stackOfCards);
		System.out.println();
		
		 // Check if the Stack is empty
		System.out.println("is stack empty? :" +stackOfCards.isEmpty());
		
		
		 // Find the size of Stack
		System.out.println("Size of stack: " +stackOfCards.size());
		
		
		// Search for an element
        // The search() method returns the 1-based position of the element from the top of the stack
        // It returns -1 if the element was not found in the stack
		
		int position = stackOfCards.search("King");
		
		if (position != -1) {
			System.out.println("Found the element \"King\" at position: " +position);
			
		}else {
			System.out.println("element not found");
		}
		
		
	}

}
