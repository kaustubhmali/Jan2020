package oopproj;

public class Customer {
	
	private int id;
	private String name;
	private Gender gender;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Customer(int id, String name, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Customer customer2 = (Customer)obj;
		if (this.id == customer2.id && this.name.equals(customer2.name) && this.gender.equals(customer2.gender)) {
			return true;
		} 
		
		return false;
		
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	

}
