package Collection.LinkedListExamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreateLinkedList {
	
	public static void main(String[] args) {
		 // Creating a LinkedList
		LinkedList<String> friends = new LinkedList<String>();
		
		// Adding new elements to the end of the LinkedList using add() method.
        friends.add("Rinku");
        friends.add("John");
        friends.add("Rahul");
        friends.add("Riya");
        
        System.out.println("Initial LinkedList:" +friends);
        
        
        // Adding an element at the specified position in the LinkedList
        friends.add(2, "Vishwa");
        System.out.println("After add (3, \"Lisa\"):" +friends);
        
     // Adding an element at the beginning of the LinkedList
      friends.addFirst("David");
      System.out.println("After addFirst (\"David\"):" +friends);
      
      // Adding an element at the end of the LinkedList (This method is equivalent to the add() method)
      friends.addLast("Jennifer");
      System.out.println("After addLast(\"Jennifer\") : " + friends);
      
      // Adding all the elements from an existing collection to the end of the LinkedList
      List<String> familyFriends = new ArrayList<String>();
      familyFriends.add("Heet");
      familyFriends.add("Sami");
      
      friends.addAll(familyFriends);
      System.out.println("After addAll(familyFriends):" +friends);
        
        
	}
}
