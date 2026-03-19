package testoverriding;

public class MainEmployee {

	public static void main(String[] args) {
	
		Employee e1 = new Manager();
	    e1.calculateSalary(80000);
		Employee e2 = new Developer();
		e2.calculateSalary(60000);
		
		
		
		

	}

}
