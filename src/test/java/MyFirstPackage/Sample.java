// 

package MyFirstPackage;

public class Sample {
		
	public static void main(String[] args) { // what is method? how many types? 
		
		
//		String obj = new String("");
//		System.out.println(obj);
	
//		System.out.println("object 1 : " + object.method2("ass"));
		
		Sample obj  = new Sample();
		
		int SD = obj.method2(56);
		
		System.out.println("this is how you pass the value : " + SD);
		
	}	
	
	void method1() { 
		System.out.println("test 1"); 
	}
	
	int method2(int a) { 
		return a;
	}
}


// Can you create object from String/double/int?
// Yes, as String = class, double, and int = Wrapper class ?