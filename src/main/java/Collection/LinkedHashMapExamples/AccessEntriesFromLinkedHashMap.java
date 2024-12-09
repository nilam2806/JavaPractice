package Collection.LinkedHashMapExamples;

import java.util.LinkedHashMap;

public class AccessEntriesFromLinkedHashMap {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> customerIdNameMapping = new LinkedHashMap<>();

		customerIdNameMapping.put(101, "David");
		customerIdNameMapping.put(102, "Janice");
		customerIdNameMapping.put(103, "Angelina");
		customerIdNameMapping.put(104, "Jerry");

		System.out.println("customerIdNameMapping=> " + customerIdNameMapping);

		// Check if a key exists in the LinkedHashMap
		Integer id = 103;
		if (customerIdNameMapping.containsKey(id)) {
			System.out.println("Cutomer with id " + id + " exists in map: " + customerIdNameMapping.get(id));
		} else {
			System.out.println("Customer with id " + id + "does not exists");
		}

		// Check if a value exists in the LinkedHashMap
		String name = "Jerry";
		if (customerIdNameMapping.containsValue(name)) {
			System.out.println("Customer name " + name + " exists in map");
		} else {
			System.out.println("Customer name " + name + "does not exists in map");
		}

		// Change the value associated with an existing key
		id = 104;
		customerIdNameMapping.put(104, "Chris");
		System.out.println("Changed the name of customer with id " + id + ", New Mapping=> " + customerIdNameMapping);

	}

}
