package testoverriding;

public class Developer extends Employee {
	void calculateSalary(double salary) {
		System.out.println("salary of developer is "+salary);
	}
	
}
