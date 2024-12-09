package Collection.HashSetExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateHashSetFromCollectionExample {
	
	public static void main(String[] args) {
		
		List<Integer> numbersDivisibleBy5 = new ArrayList<>();
		numbersDivisibleBy5.add(5);
        numbersDivisibleBy5.add(10);
        numbersDivisibleBy5.add(15);
        numbersDivisibleBy5.add(20);
        numbersDivisibleBy5.add(25);
        
        System.out.println("numbers divisible by 5 are:" +numbersDivisibleBy5);
        
        List<Integer> numbersDivisibleBy3 = new ArrayList<>();
        
        numbersDivisibleBy3.add(3);
        numbersDivisibleBy3.add(6);
        numbersDivisibleBy3.add(9);
        numbersDivisibleBy3.add(12);
        numbersDivisibleBy3.add(15);
        
        System.out.println("numbers divisible by 3 are:" +numbersDivisibleBy3);
        
        // Creating a HashSet from another collection (ArrayList)
        Set<Integer> numbersDivisibleBy5Or3 =new HashSet<>(numbersDivisibleBy5);
        
        numbersDivisibleBy5Or3.addAll(numbersDivisibleBy3);
        
        System.out.println(numbersDivisibleBy5Or3);
	}

}
