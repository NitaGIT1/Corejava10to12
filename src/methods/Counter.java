package methods;

public class Counter {

	static int staticCount = 5;
	int nonStaticCount = 10;

	public static void incrementStatic() {
		int result1 = ++staticCount;
		System.out.println(result1);
	}

	public void incrementNonStatic() {
		int result2 = ++nonStaticCount;
		System.out.println(result2);
	}

}
