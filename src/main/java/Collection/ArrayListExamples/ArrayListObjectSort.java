package Collection.ArrayListExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
		
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		
		return "{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
}
public class ArrayListObjectSort {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("arya", 20));
		people.add(new Person("jenny", 25));
		people.add(new Person("david", 45));
		people.add(new Person("", 37));
		
		System.out.println("Person list before sorting: " +people);
		
		 // Sort People by their Age
		people.sort((person1, person2) ->{
			return person1.getAge() - person2.getAge();
		});
		
		//System.out.println("Person list after sorting: " +people);
		
		
        // A more concise way of writing the above sorting function
		people.sort(Comparator.comparingInt(Person::getAge));
		
		//System.out.println("Person list after sorting: " +people);
		
        // You can also sort using Collections.sort() method by passing the custom Comparator
		Collections.sort(people, Comparator.comparing(Person::getName));
		System.out.println("Person list after sorting: " +people);
		

		
	}
	
	

}
