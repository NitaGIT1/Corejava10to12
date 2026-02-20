package methodOverriding;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e;
		e = new Manager();
		System.out.println("manager salary is " + e.calculateSalary());
		e = new Developer();
		System.out.println("Developer salary is " + e.calculateSalary());

	}

}
