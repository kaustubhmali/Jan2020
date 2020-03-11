package oopproj;

public class OrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order1 = new Order(100, 80456, "Iphone 11");
		Order order2 = new Order(100, 80456, "Iphone 11");
		
		System.out.println(order1.equals(order2));
		
		System.out.println(order1.hashCode());
		System.out.println(order2.hashCode());

	}

}
