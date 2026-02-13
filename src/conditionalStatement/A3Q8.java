package conditionalStatement;

import java.util.Scanner;

public class A3Q8 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Integer");
		int a = sc.nextInt();
		if (a >= 18) {
			System.out.println("Allowed to Drive");
		} else {
			System.out.println("Not allowed to Drive");
		}

	}

}
