package array;

public class MinMaxElement {

	public static void main(String[] args) {
		int[] arr = { 20, 30, 10, 40, 50, 60 };
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Minimun Element: " + min);
		System.out.println("Maximun Element: " + max);

	}

}
