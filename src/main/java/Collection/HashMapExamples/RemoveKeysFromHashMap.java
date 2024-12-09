package Collection.HashMapExamples;

import java.util.HashMap;
import java.util.Map;

public class RemoveKeysFromHashMap {
	
	public static void main(String[] args) {
		
		Map<String, String> studentDivisionMapping = new HashMap<>();
		
		studentDivisionMapping.put("akash", "A");
		studentDivisionMapping.put("pruthvi", "C");
		studentDivisionMapping.put("priya", "B");
		studentDivisionMapping.put("Raj", "D");
		
		System.out.println("Student division mapping: " +studentDivisionMapping);
		

        // Remove a key from the HashMap
		String student = "priya";
		String division =studentDivisionMapping.remove(student);
		
		System.out.println("Student (" +student + " => " +division + ") left the school");
		System.out.println("New Mapping: " +studentDivisionMapping);
		
		
		// Remove a key from the HashMap only if it is mapped to the given value
		boolean isRemoved = studentDivisionMapping.remove("pruthvi", "c");
		System.out.println("Did pruthvi get removed from division ? :" +isRemoved);
		
        // remove() returns null if the mapping was not found for the supplied key
		division =studentDivisionMapping.remove("neha");
		if(division == null)
		{
			System.out.println("Looks like student is not belong to this class");
			
		}else {
			System.out.println("remove student and that class");
		}
	}

}
