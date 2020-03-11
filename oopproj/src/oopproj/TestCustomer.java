package oopproj;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer1 = new Customer(101, "Anil", Gender.Male);
		Customer customer2 = new Customer(101, "Anil", Gender.Male);
		
		if (customer1.equals(customer2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		

	}

}
