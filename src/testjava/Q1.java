package testjava;

public class Q1 {

	public static void main(String[] args) {
		int num = 20;
		System.out.println("Addition: "+(num +=5));
		System.out.println("Subtraction: "+(num -=3));
		System.out.println("Multiplication: "+(num *=2));
		System.out.println("Division: "+(num /=4));
		System.out.println("Modulus: "+(num %=3));
	}

}
