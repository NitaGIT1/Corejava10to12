package methods;

public class CopyCounter {

	public static void main(String[] args) {
		Counter.incrementStatic();
		Counter c1 = new Counter();
		c1.incrementNonStatic();

	}

}
