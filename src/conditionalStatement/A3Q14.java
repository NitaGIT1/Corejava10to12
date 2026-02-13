package conditionalStatement;

import java.util.Scanner;

public class A3Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter mark");
		int mark = sc.nextInt();

		if (mark >= 80) {

			System.out.println("Enter math mark");
			int mathmark = sc.nextInt();
			if (mathmark >= 75) {
				System.out.println("Eligible");
			} else {
				System.out.println("Not Eligible because math score is low");
			}
		} else {
			System.out.println("Not eligible");
		}
	}
}
