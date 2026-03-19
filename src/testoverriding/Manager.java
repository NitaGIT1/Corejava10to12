package testoverriding;

public class Manager extends Employee{
	void calculateSalary(double salary) {
		System.out.println("Salary of manager "+salary);
	}
	

}
