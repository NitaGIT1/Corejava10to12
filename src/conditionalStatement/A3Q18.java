package conditionalStatement;

import java.util.Scanner;

public class A3Q18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'O':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'U':

			System.out.println("Its a vowel");
			break;
		default:
			System.out.println("Its consonant");

		}
	}

}
