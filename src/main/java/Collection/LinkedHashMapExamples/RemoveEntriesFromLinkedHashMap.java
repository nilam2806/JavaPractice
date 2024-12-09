package Collection.LinkedHashMapExamples;

import java.util.LinkedHashMap;

public class RemoveEntriesFromLinkedHashMap {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, String> studentClassMapping = new LinkedHashMap<>();
		
		studentClassMapping.put("Raj", "A");
		studentClassMapping.put("Neha", "C");
		studentClassMapping.put("Sai", "B");
		
		
		System.out.println("studentClassMapping=> " +studentClassMapping);
		
        // Remove a key from the LinkedHashMap
		String Class = studentClassMapping.remove("Neha");
		System.out.println("Removed student "+Class+ " and related class from mapping,\nNew Mapping=> " +studentClassMapping);
		
        // Remove a key from the LinkedHashMap only if it is mapped to the given value
		boolean isRemoved = studentClassMapping.remove("Sai", "A");
		System.out.println("Did Sai get removed from mapping? : " +isRemoved);
	}
}
