package Collection.ArrayListExamples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortExample {
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("nikita");
		names.add("aadu");
		names.add("bhushan");
		names.add("ashu");
		
		System.out.println("Before sorting: " +names);
		
        // Sort an ArrayList using its sort() method. You must pass a Comparator to the ArrayList.sort() method.
		names.sort(new Comparator<String>() {

			@Override
			public int compare(String name1, String name2) {
				
				return name1.compareTo(name2) ;
			}
		});
		
		//System.out.println("After sorting: " +names);
		
		
        // The above `sort()` method call can also be written simply using lambda expression
		names.sort((name1, name2) -> name1.compareTo(name2));
		
		//System.out.println("After sorting: " +names);
		
		// Following is an even more concise solution
		names.sort(Comparator.naturalOrder());
		System.out.println("After sorting: " +names);
	}
}
