package Collection.HashSetExamples;

import java.util.HashSet;


public class IterateHashSetUsingforEachMethod {
	
	public static void main(String[] args) {
		HashSet<String> gamesList = new HashSet<>();
		
		 gamesList.add("Football");  
	     gamesList.add("Cricket");  
	     gamesList.add("Chess");  
	     gamesList.add("Hocky");  
	     
	     System.out.println("------------Iterating by passing method reference---------------");  
	    gamesList.forEach(System.out::println); 
	    
	    System.out.println("------------Iterating by passing lambda expression---------------");  
	    gamesList.forEach(games->System.out.println(games)); 
	}

}
