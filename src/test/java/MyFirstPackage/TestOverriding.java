package MyFirstPackage;

public class TestOverriding extends MethodOverriding {
	
	// to call concrete methods, you must create an object and call them inside the main
	// but if the class is abstract, you CANNOT create an object
	// if the methods are static it's easy to call them (class name . method name();)
	// but if the methods are non static then you must create object by ..... 
																		// sub class object = new sub class();
																		// DON'T USE IT RIGHT NOW! //super class object = new sub class(); THIS IS STANDARD WAY!!! it's called UPCASTING/ 
	public static void main(String[] args) { 
		TestOverriding object = new TestOverriding(); 
		// this is also known as instantiate; meaning represent by an instance 
		//MethodOverriding obj = new TestOverriding(); 
		object.getMoney();
	}
	
	// to override you must implement the unimplemented methods
	@Override
	void getPaid() { // zero parameter 
		
	}

	@Override
	void getPaid(int a) { // oner parameter 
		
	}


}
