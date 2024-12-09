package Collection.HashMapExamples;

import java.util.HashMap;
import java.util.Map;

public class CustomerMappingWithCustomerSalary {
	
	public static void main(String[] args) {
		
        // Creating Customer objects
        Customer customer1 = new Customer(1, "John Doe", 30, "New York");
        Customer customer2 = new Customer(2, "Jane Smith", 25, "Los Angeles");

        // Creating CustomerSalary objects
        CustomerSalary salary1 = new CustomerSalary(1, 50000);
        CustomerSalary salary2 = new CustomerSalary(2, 60000);

        // Creating a map to link Customer IDs with their salaries
        Map<Integer, CustomerSalary> customerSalaryMap = new HashMap<>();
        customerSalaryMap.put(salary1.getCustomerId(), salary1);
        customerSalaryMap.put(salary2.getCustomerId(), salary2);

        // Retrieving and printing customer salaries based on customer IDs
        System.out.println("Customer Salary Details:");
        for (Customer customer : new Customer[]{customer1, customer2}) {
            CustomerSalary salary = customerSalaryMap.get(customer.getCustomerId());
            System.out.println(customer);
            if (salary != null) {
                System.out.println("Salary: " + salary.getSalary());
            } else {
                System.out.println("Salary details not available.");
            }
           
        }
    }
	
	

}
