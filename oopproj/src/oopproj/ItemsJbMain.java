package oopproj;

public class ItemsJbMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		JB_items items1 = new JB_items();
		
		items1.setId(101);
		items1.setName("Samsung S10+");
		items1.setPrice(890);
		
		System.out.println("ID : "+items1.getId());
		System.out.println("Name : "+items1.getName());
		System.out.println("Price : "+items1.getPrice());

	}

}
