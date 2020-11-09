// Constructor : 
				// constructor is a method like structure
				// it's mainly used for removing default values
				// it forces the user to place a user defined value. 
				// there are 2 types : parameterized & non parameterized / default constructor 
				// it must be same as class name
				// can't use void because it always returns value



package MyFirstPackage;

public class MyFirstConstructor {
	
	int a;
	double b;
	String fullName;
	
	public static void main(String[] args) {
		MyFirstConstructor obj = new MyFirstConstructor(8); 
	}
	
	MyFirstConstructor(){ // non parameterized / default 
		System.out.println("print something");
	}
	
	MyFirstConstructor(int a){ // parameterized (1)
		this.a = a; // global = local 
		System.out.println(a);
	}
	
	MyFirstConstructor(double b, String fullName){ // parameterized (2)
		this.b=b;
		this.fullName=fullName;
		System.out.println(b);
		System.out.println(fullName);
	}

}
