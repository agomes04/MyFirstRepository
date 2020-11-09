//


package MyFirstPackage;

public class MyfirstClass {
	
	static int a =40;
	
	void getmoney(int b) {
		System.out.println(a);
		System.out.println(b);
	}
		
	public static void main(String[] args) {
		MyfirstClass obj = new MyfirstClass();
		obj.getmoney(30); 
	}
}