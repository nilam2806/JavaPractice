package Collection.HashMapExamples;

import java.util.HashMap;
import java.util.Map;

class Employee {
	private Integer id;
	private String name;
	private String city;

	public Employee(Integer id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {
		return "Employee{" + "name'" + name + '\'' + ", city'" + city + '\'' + "}";
	}
}

public class HashMapUserDefinedObject {
	
	public static void main(String[] args) {
		
	Map<Integer, Employee> employeesMap = new HashMap<>();
	
	employeesMap.put(1001, new Employee(1001, "Janice", "Mumbai"));
	employeesMap.put(1002, new Employee(1002, "Angelina", "Delhi"));
	employeesMap.put(1004, new Employee(1004, "Jack", "Pune"));
	
	System.out.println(employeesMap);
	
	}
}