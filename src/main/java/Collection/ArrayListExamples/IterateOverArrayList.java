package Collection.ArrayListExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArrayList {

	public static void main(String[] args) {

		List<String> tvShows = new ArrayList<>();

		tvShows.add("Money Heist");
		tvShows.add("Friends");
		tvShows.add("Avtar");
		tvShows.add("Avengers");

		System.out.println("popular tvShows are:" + tvShows);

		System.out.println("=== Iterate using Java 8 forEach and lambda ===");
		tvShows.forEach(tvShow -> {
			System.out.println(tvShow);
		});

		System.out.println("\n=== Iterate using an iterator() ===");
		Iterator<String> tvShowsIterator = tvShows.iterator();
		while (tvShowsIterator.hasNext()) {
			String tvShow = tvShowsIterator.next();
			System.out.println(tvShow);
		}

		System.out.println("\n=== Iterate using an iterator() and Java 8 forEachRemaining() method ===");
		tvShowsIterator = tvShows.iterator();
		tvShowsIterator.forEachRemaining(tvShow -> {
			System.out.println(tvShow);
		});

		System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
		ListIterator<String> tvShowsListIterator = tvShows.listIterator(tvShows.size());
		while (tvShowsListIterator.hasPrevious()) {
			String tvShow = tvShowsListIterator.previous();
			System.out.println(tvShow);
		}

		System.out.println("\n=== Iterate using simple for-each loop ===");
		for (String tvshow : tvShows) {
			System.out.println(tvshow);
		}

		System.out.println("\n=== Iterate using for loop with index ===");
		for (int i = 0; i < tvShows.size(); i++) {
			System.out.println(tvShows.get(i));
		}

	}

}
