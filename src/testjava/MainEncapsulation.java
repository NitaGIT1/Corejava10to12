package testjava;

public class MainEncapsulation {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setEmpId("1111");
		e1.setSalary(80000);

		System.out.println("Employee id is " + e1.getEmpId());
		System.out.println("Employee salary is " + e1.getSalary());

	}

}
