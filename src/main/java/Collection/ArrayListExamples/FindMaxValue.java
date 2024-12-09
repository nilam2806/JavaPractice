package Collection.ArrayListExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxValue {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 30, 50, 110, 90, 5, 11);

		List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).toList();

		int firstheighest = sortedList.get(0);

		int secondheighest = sortedList.get(1);

		System.out.println("First Heighest: " + firstheighest);
		System.out.println("Second Heighest: " + secondheighest);
	}
}
