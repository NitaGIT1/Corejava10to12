package conditionalStatement;

public class A3Q13 {

	public static void main(String[] args) {
		int a = 0;
		if (a > 0) {
			System.out.println("POSIIIVE NUMBER");
			if (a % 2 == 0) {
				System.out.println("EVEN NUMBER");
			} else {
				System.out.println("ODD NUMBER");
			}
		} else if (a == 0) {
			System.out.println("ZERO IS NEUTRAL INTEGER");
		} else {
			System.out.println("NEGATIVE NUMBER");
		}

	}
}
