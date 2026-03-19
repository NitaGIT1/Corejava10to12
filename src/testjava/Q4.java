package testjava;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 5: ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("very bad");
			break;
			
        case 2:
			System.out.println("Bad");
			break;
		case 3:
			System.out.println("Average");
			break;
		case 4:
			System.out.println("Good");
			break;
		case 5:
			System.out.println("Excellent");
			break;
			default: System.out.println("Invalid Number");
		}

	}

}
