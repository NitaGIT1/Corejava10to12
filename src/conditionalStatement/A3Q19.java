package conditionalStatement;

import java.util.Scanner;

public class A3Q19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Choose Operator:");
		System.out.println("1 = Addition");
		System.out.println("2 = Subtraction");
		System.out.println("3 = Division");
		System.out.println("4 = Multiplication");

		int operator = sc.nextInt();

		switch (operator) {
		case 1:
			System.out.println("Result = " + (a + b));
			break;

		case 2:
			System.out.println("Result = " + (a - b));
			break;

		case 3:
			if (b != 0) {
				System.out.println("Result = " + (a / b));
			} else {
				System.out.println("Cannot divide by zero");
			}
			break;

		case 4:
			System.out.println("Result = " + (a * b));
			break;

		default:
			System.out.println("Invalid Choice");
		}
	}
}
