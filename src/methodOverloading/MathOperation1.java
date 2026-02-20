package methodOverloading;

public class MathOperation1 {
	void multiply(int a, int b) {
		System.out.println("Multiply : " + (a * b));
	}

	void multiply(double a, double b) {
		System.out.println("Multply : " + (a * b));
	}

}
