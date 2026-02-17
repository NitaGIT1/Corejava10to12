package conditionalStatement;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter temperature");
		int temp = sc.nextInt();

		if (temp > 30) {
			System.out.println("Its hot");
		} else if (20 <= temp && temp <= 30) {
			System.out.println("Its warm");
		} else if (10 <= temp && temp <= 19) {
			System.out.println("Its cold");
		} else {
			System.out.println("Its very cold");
		}
	}

}
