package testCoreJava;

import java.util.Scanner;

public class IfElseQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = sc.nextInt();

		if (number > 0) {
			System.out.println("positive Number");
			if (number % 2 == 0) {
				System.out.println("Number is even");
			} else {
				System.out.println("Number is odd");

			}

		}

	}

}
