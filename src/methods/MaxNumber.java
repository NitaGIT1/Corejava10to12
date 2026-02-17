package methods;

public class MaxNumber {

	public void findMax(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println(a + " is greater");
		} else if (b > a && b > c) {
			System.out.println(b + " is greater");
		} else {
			System.out.println(c + " is greater");
		}

	}

	public static void main(String[] args) {
		MaxNumber m1 = new MaxNumber();
		m1.findMax(50, 20, 30);
	}

}
