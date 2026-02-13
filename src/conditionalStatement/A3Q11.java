package conditionalStatement;

public class A3Q11 {

	public static void main(String[] args) {
		int a = 50;
		int b = 90;
		int c = 30;
		if (a > b && a > c) {
			System.out.println("a is greater");
		} else if (b > a && b > c) {
			System.out.println("b is greater");
		} else if (c > a && c > b) {
			System.out.println("c is greater");
		}

	}
}
