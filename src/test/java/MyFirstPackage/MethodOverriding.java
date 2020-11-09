// Overriding : in Polymorphism you can do overriding but not with constructors 
				// needs inheritance 
				// transferring property from one class to another 
				// property means methods & variables 

package MyFirstPackage;

public abstract class MethodOverriding {
		
	abstract void getPaid();
	
	abstract void getPaid(int a);

	
	void getMoney(){
		System.out.println("print something");
	}
	
	int getSalary(){
		return 5000;
	}

}
