package Collection.HashMapExamples;

public class CustomerSalary {
	
	 private int customerId;
	    private double salary;

	    public CustomerSalary(int customerId, double salary) {
	        this.customerId = customerId;
	        this.salary = salary;
	    }

	    public int getCustomerId() {
	        return customerId;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    @Override
	    public String toString() {
	        return "CustomerSalary{" + "customerId=" + customerId + ", salary=" + salary + '}';
	    }

}
