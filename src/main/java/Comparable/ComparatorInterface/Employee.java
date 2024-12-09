package Comparable.ComparatorInterface;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private double salary;
	private LocalDate joiningDate;

	public Employee(int id, String name, double salary, LocalDate joiningDate) {
//		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate =joiningDate;
	}
	
	 // Compare Two Employees based on their ID
    /**
     * @param   anotherEmployee - The Employee to be compared.
     * @return  A negative integer, zero, or a positive integer as this employee
     *          is less than, equal to, or greater than the supplied employee object.
    */
	
	@Override
	public int compareTo(Employee anotherEmployee) {
		return this.getId() - anotherEmployee.getId();
 	}
	
	 // Compare Two Employees based on their Joining Date

//	@Override 
//	public int compareTo(Employee anotherEmployee) {
//		return this.getJoiningDate().compareTo(anotherEmployee.joiningDate);
//	}
	
    // Two employees are equal if their IDs are equal
   @Override
	public boolean equals(Object o) {
		if (this==o) return true; 
		if (o== null || getClass()!= o.getClass()) return false; 
		Employee employee = (Employee) o;
		return id == employee.id;
		
	}
   
   @Override
   public int hashCode() {
	   return Objects.hash(id);
   }
	
	@Override
	public String toString() {
		return "Employee {" + "id= " + id + ", Name= '" +name+ '\'' + ", Salary= " +salary+ ", Joining Date= " +joiningDate +"}";
	}

	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();		
		employees.add(new Employee(1010, "David", 10000.10, LocalDate.of(2023, 8, 23)));
		employees.add(new Employee(1005, "Sachin", 25000.00, LocalDate.of(2022, 6, 10)));
        employees.add(new Employee(1008, "Chris", 300000.2, LocalDate.of(2024, 5, 15)));
		
        System.out.println("Employees (sorted based on Employee class's compareTo() function)");
        System.out.println(employees);
	}
	
}


/*
  public int compareTo(Employee anotherEmployee) {
    if(this.getId() < anotherEmployee.getId()) { negative if the ID of this employee is less then the ID of the supplied employee,

        return -1;
    } else if (this.getId() > anotherEmployee.getId()) {  positive if the ID of this employee is greater than the ID of the supplied employee.

        return 1;
    } else {    zero if the ID of this employee is equal to the ID of the supplied employee, and

        return 0;
    }
}*/
