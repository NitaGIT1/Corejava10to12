package conditionalStatement;

import java.util.Scanner;

public class A3Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Do you have membership card? true/false");
		boolean hasCard = sc.nextBoolean();
		
		if(age>=18 && hasCard )
		{
			System.out.println("Entry allowed");
		}
		else {
			System.out.println("Entry Denied");
		}

	}

}
