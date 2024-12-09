package Collection.HashSetExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateOverHashSet {
	public static void main(String[] args) {
		Set<String> famousSeries = new HashSet<String>();

		famousSeries.add("Money Heist");
		famousSeries.add("Spiderman");
		famousSeries.add("Asur");
		famousSeries.add("Avtar");
		famousSeries.add("Harry Potter");

		System.out.println("Famous series: " + famousSeries);

		System.out.println("=== Iterate over a HashSet using Java 8 forEach and lambda ===");
		famousSeries.forEach(series -> {
			System.out.println(series);
		});

		System.out.println("\n=== Iterate over a HashSet using iterator() ===");
		Iterator<String> famousSeriesIterator = famousSeries.iterator();
		while (famousSeriesIterator.hasNext()) {
			String series = famousSeriesIterator.next();
			System.out.println(series);
		}

		System.out.println("\n=== Iterate over a HashSet using iterator() and Java 8 forEachRemaining() method ===");
		famousSeriesIterator = famousSeries.iterator();
		famousSeriesIterator.forEachRemaining(series -> {
			System.out.println(series);
		});

//        System.out.println("\n=== Iterate over a HashSet using descendingIterator() ===");
//        Iterator<String> famousSeriesdescendingIterator = famousSeries.iterator();
//        while(famousSeriesdescendingIterator.hasNext()) {
//        	String series = famousSeriesdescendingIterator.next();
//        	System.out.println(series);
//        	}

		System.out.println("=== Iterate over a HashSet using simple for-each loop ===");
		for (String series : famousSeries) {
			System.out.println(series);
		}

	}
}
