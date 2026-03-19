package testjava;

public class Calculator {

	public static void subtract(int a, int b) {
		System.out.println("Subtraction: " + (a - b));
	}

	public void divide(int a, int b) {
		System.out.println("Divide: " + (a / b));
	}

	public static void main(String[] args) {
		subtract(30, 20);
		Calculator c1 = new Calculator();
		c1.divide(10, 2);
	}

}
