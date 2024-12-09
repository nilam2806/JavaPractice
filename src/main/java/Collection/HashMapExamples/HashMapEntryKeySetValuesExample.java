package Collection.HashMapExamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEntryKeySetValuesExample {
	public static void main(String[] args) {
		Map<String, String> countryISOCodeMapping = new HashMap<>();
		
		countryISOCodeMapping.put("India", "IN");
		countryISOCodeMapping.put("Russia", "RU");
		countryISOCodeMapping.put("Japan", "JP");
		countryISOCodeMapping.put("China", "CN");
		countryISOCodeMapping.put("United State of America", "US");
		
		System.out.println("countryISOCodeMapping :" +countryISOCodeMapping);
		 // HashMap's entry set
		Set<Map.Entry<String, String>> countryISOCodEntries = countryISOCodeMapping.entrySet();
		System.out.println("countryISOCode entries :" +countryISOCodEntries);
		
		 // HashMap's key set
		Set<String> countries = countryISOCodeMapping.keySet();
		System.out.println("countries: " +countries);
		
        // HashMap's values
		Collection<String> isoCodes = countryISOCodeMapping.values();
		System.out.println("isoCodes: " +isoCodes);
	}
}
