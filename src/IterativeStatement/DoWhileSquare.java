package IterativeStatement;

public class DoWhileSquare {

	public static void main(String[] args) {
		int i = 1;

		do {
			System.out.println("Square of " + i + "=" + i * i);
			i++;
		} while (i <= 5);
	}

}
