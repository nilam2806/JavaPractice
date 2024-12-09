package Collection.PriorityQueueExample;

import java.util.Objects;
import java.util.PriorityQueue;

class Employee implements Comparable<Employee> {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Employee employee = (Employee) o;
		return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}

	// Compare two employee objects by their salary
	@Override
	public int compareTo(Employee employee) {
		if (this.getSalary() > employee.getSalary()) {
			return 1;
		} else if (this.getSalary() < employee.getSalary()) {
			return -1;
		} else {
			return 0;
		}
	}

	public String toString() {
		return "Employee {" + "name= '" + name + '\'' + ", salary= " + salary + '}';
	}

}

public class PriorityQueueUserDefinedObject {

	public static void main(String[] args) {
		/*
		 * The requirement for a PriorityQueue of user defined objects is that
		 * 
		 * 1. Either the class should implement the Comparable interface and provide the
		 * implementation for the compareTo() function. 2. Or you should provide a
		 * custom Comparator while creating the PriorityQueue.
		 */

		// Create a PriorityQueue
		PriorityQueue<Employee> employeePriorityQueue = new PriorityQueue<>();

		employeePriorityQueue.add(new Employee("Jerry", 50000.0));
		employeePriorityQueue.add(new Employee("Angelina", 70000.10));
		employeePriorityQueue.add(new Employee("Janice", 30000.25));
		employeePriorityQueue.add(new Employee("David", 450000));
		employeePriorityQueue.add(new Employee("Chris", 20000.20));

		/*
		 * The compareTo() method implemented in the Employee class is used to determine
		 * in what order the objects should be dequeued.
		 */

		while (!employeePriorityQueue.isEmpty()) {
			System.out.println(employeePriorityQueue.remove());
		}

	}
}
