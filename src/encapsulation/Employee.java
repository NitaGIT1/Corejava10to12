package encapsulation;

public class Employee {
	private String empId;
	private double salary;

	public void setEmpId(String id) {
		empId = id;
	}

	public String getEmpId() {
		return empId;
	}

	public void setSalary(double sal) {
		salary = sal;
	}

	public double getSalary() {
		return salary;
	}

}
