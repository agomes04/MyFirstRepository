
//LOCAL VARIABLE AND GLOBAL VARIABLE 
// STATIC = KEY WORD, DOESN'T NEED OBJECT TO BE CALLED, METHOD & VARIABLE BOTH MUST BE STATIC 


package MyFirstPackage;

public class Animal {
	
	 static int a = 400; // GLOBAL INSTANCE (NON-STATIC)
	 static double b = 324.43;; 
	 String device = "laptop"; // GLOBAL CLASS LEVEL (STATIC)
	
	public static void main(String[] args) { // IF YOUR METHOD IS STATIC, YOUR VARIABLES MUST BE STATIC 
		Animal obj = new Animal();
		obj.getEducation();
		obj.payMoney();
		System.out.println(a);
	}  
		  
	void getEducation() { // LOCAL VARIABLE INSIDE THE PARAMETER 
		a = 500;
		System.out.println(a);
	}
	
	void payMoney() {
		a = 700;
		System.out.println(a);
	}

}
