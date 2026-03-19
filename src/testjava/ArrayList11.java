package testjava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList11 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(89);
		numbers.add(78);
		numbers.add(56);
		numbers.add(45);
		numbers.add(199);

		System.out.println("ArrayList print all list: " + numbers);

		System.out.println("After retrieving the element at index 4: " + numbers.get(4));
		
		numbers.set(3,200);
		System.out.println("ArrayList after set 200 at 3rd position: "+numbers);

		numbers.remove(Integer.valueOf(78));
		System.out.println("After removing element of 78: " + numbers);

		System.out.println("Iterative through numbers: ");
		for (int num : numbers) {
			System.out.println(num);
		}

		System.out.println("Whole ArrayList: " + numbers);
         }

}
