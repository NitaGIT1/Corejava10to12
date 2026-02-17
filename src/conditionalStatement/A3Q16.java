package conditionalStatement;

import java.util.Scanner;

public class A3Q16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String username = sc.nextLine();

		System.out.println("Enter Password");
		String password = sc.nextLine();

		if (username.equals("admin") && password.equals("1234")) {

			System.out.println("Login Successful");
		}

		else {
			System.out.println("Invalid Credentials");
		}
	}
}