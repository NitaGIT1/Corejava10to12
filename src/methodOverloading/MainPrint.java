package methodOverloading;

public class MainPrint {

	public static void main(String[] args) {
		ExamplePrinter e1 = new ExamplePrinter();
		e1.printValue(20);
		e1.printValue(3.1);
		e1.printValue("hello");
		e1.printValue(true);

	}

}
