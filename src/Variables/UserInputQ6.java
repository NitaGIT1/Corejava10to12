package Variables;

import java.util.Scanner;


public class UserInputQ6 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name: ");
	String name = sc.next();
	
	System.out.println("Enter your course name: ");
	String coursename = sc.next();
	
	System.out.println("Enter your age: ");
    int age = sc.nextInt();
    
    System.out.println("My name is "+name+ "."+" I m pursuing "+coursename+" course."+" My age is "+age+".");

	}

}
