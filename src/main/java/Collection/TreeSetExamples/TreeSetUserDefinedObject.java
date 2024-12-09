package Collection.TreeSetExamples;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
    // Two Employees are equal if their IDs are equal
	@Override
	public boolean equals(Object o) {
		if (this==o) return true;
		if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	
	 // Compare employees based on their IDs
    @Override
    public int compareTo(Employee employee) {
        return this.getID() - employee.getID();
    }
    
    
	@Override
	public String toString() {
		return "Employee{" + "id = " + id + ", name'" + name + '\'' + '}';
	}
	
	
	
}

public class TreeSetUserDefinedObject {
	
	public static void main(String[] args) {
	
		 // Creating a TreeSet of User Defined Objects.
		
        /*
           The requirement for a TreeSet of user defined objects is that

           1. Either the class should implement the Comparable interface and provide
              the implementation for the compareTo() function.
           2. Or you should provide a custom Comparator while creating the TreeSet.
        */
		
		SortedSet<Employee> employees = new TreeSet<Employee>();
		
		employees.add(new Employee(1010, "David"));
		employees.add(new Employee(1005, "Sachin"));
        employees.add(new Employee(1008, "Chris"));
		
        System.out.println("Employees (sorted based on Employee class's compareTo() function)");
        System.out.println(employees);
        
        
        // Providing a Custom Comparator (This comparator compares the employees based on their Name)
        employees = new TreeSet<>(Comparator.comparing(Employee::getName));
        employees.add(new Employee(1010, "David"));
		employees.add(new Employee(1005, "Sachin"));
        employees.add(new Employee(1008, "Chris"));
        
        System.out.println("\nEmployees (sorted based on the supplied Comparator)");
        System.out.println(employees);
        
	}

}
