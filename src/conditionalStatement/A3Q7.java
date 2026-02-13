package conditionalStatement;

import java.util.Scanner;

public class A3Q7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Integer");
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println("Positive number");
		} else {
			System.out.println("Negative number");
		}
	}

}
