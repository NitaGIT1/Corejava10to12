package exceptionHandling;

public class TryAndCatcH {

	public static void main(String[] args) {
		try {
			int result = 10 / 0; // Division by zero (will throw exception)
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Cannot divide by zero!");
		}
		 finally {
			 System.out.println("This will always execute.");
			 }
	}

}
