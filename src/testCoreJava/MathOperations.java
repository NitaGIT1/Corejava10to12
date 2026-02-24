package testCoreJava;

public class MathOperations {

	static void multiplyNumbers(int a, int b) {
		System.out.println("Multiplication = " + (a * b));

	}

	void addNumbers(int c, int d) {
		System.out.println("Sum = " + (c + d));
	}

	public static void main(String[] args) {
		multiplyNumbers(5, 6);

		MathOperations obj = new MathOperations();
		obj.addNumbers(2, 5);

	}

}
