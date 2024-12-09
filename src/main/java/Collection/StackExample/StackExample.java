package Collection.StackExample;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		Stack<String> stackOfCards = new Stack<>();
		
		stackOfCards.push("Jack");
		stackOfCards.push("Queen");
		stackOfCards.push("King");
		stackOfCards.push("Ace");
		
		System.out.println("Stack => " +stackOfCards);
		System.out.println();
		
		
		 // Popping items from the Stack
		String cardAtTop = stackOfCards.pop();  // Throws EmptyStackException if the stack is empty
		System.out.println("Stack Pop: " +cardAtTop);  
		System.out.println("Current stack => " +stackOfCards);
		System.out.println();
		
        // Get the item at the top of the stack without removing it
		cardAtTop = stackOfCards.peek();
		System.out.println("Stack peek => " +cardAtTop);
		System.out.println("Current stack => " +stackOfCards);
	}

}
