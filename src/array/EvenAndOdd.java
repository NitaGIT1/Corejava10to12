package array;

public class EvenAndOdd {

	public static void main(String[] args) {
		int[] arr = { 12, 5, 4, 8, 13 };
		System.out.println("Even Numbers:");
		for (int num : arr) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}

		}
		System.out.println("\nOdd Numbers");
		for (int num : arr) {
			if (num % 2 != 0) {
				System.out.print(num + " ");
			}
		}
	}

}
