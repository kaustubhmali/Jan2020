package oopproj;

public class Jb_Supplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier cosco = new Supplier();
		cosco.setId(286);
		cosco.setName("Cosco");
		cosco.setEmail("oders@cosco.com");
		cosco.setPhone(8967878969L);
		
		System.out.println("ID : "+cosco.getId());
		System.out.println("Name: "+cosco.getName());
		System.out.println("Email: "+cosco.getEmail());
		System.out.println("Phone: "+cosco.getPhone());

	}

}
