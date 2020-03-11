package oopproj;

public class Order {
	
	private int id;
	private int prodouctId;
	private String comments;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int id, int prodouctId, String comments) {
		super();
		this.id = id;
		this.prodouctId = prodouctId;
		this.comments = comments;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Order order1 = (Order)obj;
		if (this.id ==  order1.id && this.prodouctId == order1.prodouctId && this.comments.contentEquals(order1.comments))
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + prodouctId;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		return result;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProdouctId() {
		return prodouctId;
	}

	public void setProdouctId(int prodouctId) {
		this.prodouctId = prodouctId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	

}
