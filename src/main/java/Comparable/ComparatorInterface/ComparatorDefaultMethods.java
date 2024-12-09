package Comparable.ComparatorInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDefaultMethods {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(1001, "Janice", 50000.10, LocalDate.of(2023, 1, 10)));
		employees.add(new Employee(1002, "Chris", 40000.3, LocalDate.of(2023, 3, 10)));
		employees.add(new Employee(1003, "David", 75000, LocalDate.of(2023, 3, 20)));
		employees.add(new Employee(1001, "Sam", 50000.10, LocalDate.of(2016, 5, 25)));


		System.out.println("Employees => " + employees);
		
		// Sort employees by Name
		Collections.sort(employees, Comparator.comparing(Employee::getName));
		System.out.println("\nEmployee (Sorting by Name) => " +employees);
		
		//sort employees  by salary
		Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));
		System.out.println("\nEmployee (Sorting by Salary) => " +employees);
		
		//sort employees by joining date
		Collections.sort(employees, Comparator.comparing(Employee::getJoiningDate));
		System.out.println("\nEmployee (sorting by Joining Date) => " +employees);
		
		// Sort employees by Name in descending order
		Collections.sort(employees, Comparator.comparing(Employee::getName).reversed());
		System.out.println("\nEmployee (Sorting by Name in descending order) => " +employees);
		
		 // Chaining multiple Comparators
        // Sort by Salary. If Salary is same then sort by Name
		Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName));
		System.out.println("\nEmployee (Sorted by salary and name) => " +employees);
	}

}
