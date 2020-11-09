// CREATE 2 GLOBAL VARIABE & NAME IT SALARY & MONEY
// ASSIGN THE VALE 50 & 100 INSIDE LOCAL
// PRINT SALARY & MONEY
// PRINT SALARY + MONEY


package MyFirstPackage;

public class Human {
	int salary;
	int money;
	int x = salary + money;
	
	public static void main(String[] args) {
		Human object = new Human();
		object.getSalary(); 
		object.getMoney(); 
	}
	void getSalary() { 
		salary = 50; 
		money = 100;
		//x = salary + money;
		System.out.println(salary); // 
		System.out.println(money); // 
		System.out.println("The total of money + salary is : " + x);
	}

	int getMoney(){
		System.out.println(salary); //
		System.out.println(money); //
		x = salary + money;
		System.out.println("The total of money + salary is : " + x);
		return 10;
	}
	
}