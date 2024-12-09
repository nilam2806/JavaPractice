package Collection.HashMapExamples;

import java.util.HashMap;
import java.util.Map;

public class AccessKeysFromHashMap {
	
	public static void main(String[] args) {
		
		//create HashMap
		
		Map<String, String> userCityMapping = new HashMap<>();
		
		// Check if a HashMap is empty
		
		System.out.println("is userCityMapping empty? :"+userCityMapping.isEmpty());
		
     	// Adding key-value pairs to a HashMap
		
		userCityMapping.put("nilam", "Us");
		userCityMapping.put("Abhi", "UK");
		userCityMapping.put("Yash", "Canada");
		userCityMapping.put("Neha", "Japan"); 
		
		System.out.println("userCityMapping like:" +userCityMapping);
		
		// Find the size of a HashMap
		System.out.println("we have information of " +userCityMapping.size() +" users");
		
		
		
		String username = "Yash";
		 // Check if a key exists in the HashMap
		if(userCityMapping.containsKey(username)) {
			// Get the value assigned to a given key in the HashMap
			String city = userCityMapping.get(username);
			
			System.out.println(username+ " live in " +city);
		}else {
            System.out.println("City details not found for user " + username);
        }
		
		
		String city = "Japan"; 
		//String city = "Japan"; 
        // Check if a value exists in a HashMap
		if(userCityMapping.containsValue(city)) {
			System.out.println("there is user in userCityMapping who lives in " + city); 
		}else {
			System.out.println("there is no user in userCityMapping who lives " +city);
		}
	}

}
