package Comparable.ComparatorInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableUsingCollectionSort {
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(1010, "David", 10000.0, LocalDate.of(2022, 7, 12)));
		employees.add(new Employee(1005, "Chris", 23000.23, LocalDate.of(2024, 8, 1)));
		employees.add(new Employee(1015, "Jerry", 55500.2, LocalDate.of(2023, 1, 10)));
		employees.add(new Employee(1030, "Janice", 78500.9, LocalDate.of(2022, 5, 11)));

		System.out.println("Arraylist before sorting => " +employees);
		
        // This will use the `compareTo()` method of the `Employee` class to compare two employees and sort them.
		Collections.sort(employees);
		
		System.out.println("Arraylist after sorting => " +employees);

		
	}

}
