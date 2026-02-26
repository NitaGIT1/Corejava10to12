package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class NumberList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		// 89,78,56,45,199
		numbers.add(89);
		numbers.add(78);
		numbers.add(56);
		numbers.add(45);
		numbers.add(199);

		System.out.println("ArrayList after adding numbers: " + numbers);
		
		

		System.out.println("After retrieving the element at index 4: " + numbers.get(4));
		
		

		numbers.remove(Integer.valueOf(78));
		System.out.println("After removing element of 78: " + numbers);

		System.out.println("Iterative through numbers: ");
		for (int num : numbers) {
			System.out.println(num);
		}

		System.out.println("Whole ArrayList: " + numbers);

		Collections.sort(numbers);
		System.out.println("After sorting numbers: " + numbers);

		Collections.reverse(numbers);
		System.out.println("After reversing numbers: " + numbers);
	}

}
