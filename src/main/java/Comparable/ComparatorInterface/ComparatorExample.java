package Comparable.ComparatorInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(1001, "Janice", 50000.10, LocalDate.of(2023, 1, 10)));
		employees.add(new Employee(1002, "Chris", 40000.3, LocalDate.of(2023, 2, 20)));
		employees.add(new Employee(1003, "David", 75000, LocalDate.of(2023, 3, 20)));
		

		System.out.println("Employees => " +employees);
		
		
		Comparator<Employee> employeeNameComparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
			
		};
		
		 /*
        The above Comparator can also be written using lambda expression like so =>
        employeeNameComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());

        Which can be shortened even further using Java 8 Comparator default method
        employeeNameComparator = Comparator.comparing(Employee::getName)
        */
		
		Collections.sort(employees, employeeNameComparator);
		System.out.println("\nEmployees (Sorted by Name) => " + employees);
		
		
        // Sort employees by Salary
		Comparator<Employee> employeeSalaryComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			if (e1.getSalary()< e2.getSalary()) {
				return -1;
				
			}else if (e1.getSalary() > e2.getSalary()) {
					return 1;
					
			}else {
					return 0;
				}
			}
			
		};
		
		Collections.sort(employees, employeeSalaryComparator);
		System.out.println("\nEmployees (Sorted by Salary) => " +employees);
		
		
		  // Sort employees by JoiningDate
		Comparator<Employee> employeeJoiningDateComparator = new Comparator<Employee>() {
			
			public int compare(Employee e1, Employee e2) {
				return e1.getJoiningDate().compareTo(e2.getJoiningDate());
			}
		};
		
		Collections.sort(employees,employeeJoiningDateComparator);
		System.out.println("\nEmployees (Sorted by Joining Date) => " +employees);
	}
}
