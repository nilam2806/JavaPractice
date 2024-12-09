package Collection.HashMapExamples;

public class Customer {
	 private int customerId;
	    private String name;
	    private int age;
	    private String city;

	    public Customer(int customerId, String name, int age, String city) {
	        this.customerId = customerId;
	        this.name = name;
	        this.age = age;
	        this.city = city;
	    }

	    public int getCustomerId() {
	        return customerId;
	    }
	    
	    @Override
	     public String toString() {
	        return "Customer{" + "customerId=" + customerId +  ", name='" + name + '\'' + ", age=" + age + ", city='" + city + '\'' + '}';
	    }
	    

}
