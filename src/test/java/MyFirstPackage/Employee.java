package MyFirstPackage;

public class Employee {

	// this is q instance variable, and visible for any child class.
	public String empName;

	// empSalary variable is visible in Employee class only.
	private double empSalary;

	// employee name is set in the constructor.
	public Employee(String ename) {
		this.empName = ename;
	}

	public Employee(String ename, String lastName) {
		this.empName = ename;
	} 

	// method to set employee salary.
	public void setSalary(double esalary) {
		empSalary = esalary;
	}

	// method prints the employee information.
	public void getEmpInfo() {
		System.out.println("Employee Name Is  : " + empName);
		System.out.println("Employee Salary Is : " + empSalary);
	}

	public static void main(String args[]) {
		Employee obj = new Employee("Steve"); // the second Employee is a default constructor
		obj.setSalary(25000);
		obj.getEmpInfo();
	}
}