package Collection.ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayList {
	
	public static void main(String[] args) {
		
		List<String> topCompanies = new ArrayList<String>();
		
		//check if an arraylist is empty 
		System.out.println("is the topCompanies list is empty? :" +topCompanies.isEmpty());
		
		topCompanies.add("Google");
		topCompanies.add("Apple");
		topCompanies.add("Microsoft");
		topCompanies.add("Amazon");
		topCompanies.add("Facebook");
		
		System.out.println("arraylist is :" +topCompanies);
		
		// Find the size of an ArrayList
		System.out.println("Here are the " +topCompanies.size()+ " top companies in the world");
		
        // Retrieve the element at a given index
		String bestCompany = topCompanies.get(0);
		String thirdBestCompany = topCompanies.get(2);
		String lastCompany = topCompanies.get(topCompanies.size()-1);
		
		System.out.println("the best company in the world is: " +bestCompany);
		System.out.println("the third best company in the world is: " +thirdBestCompany);
		System.out.println("the last company in the world is: " +lastCompany);

		 // Modify the element at a given index
		topCompanies.set(3, "Barclays");
		System.out.println("updated list is: " +topCompanies);
		
	}

}
