package methodOverloading;

public class ExamplePrinter {
	void printValue(int num) {
		System.out.println("Prints an integer value."+num);

	}

	void printValue(double num) {
		System.out.println("Prints a double value."+num);

	}

	void printValue(String text) {
		System.out.println("Prints a String value."+text);

	}

	void printValue(Boolean flag) {
		System.out.println("Prints a Boolean value."+flag);

	}

}
