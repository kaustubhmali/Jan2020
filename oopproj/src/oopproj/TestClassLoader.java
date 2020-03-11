package oopproj;

public class TestClassLoader {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		Class class1 = Class.forName("com.Item");
		
		Order order1 = (Order)class1.newInstance();
		

	}

}
