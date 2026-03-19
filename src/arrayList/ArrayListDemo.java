package arrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// 1. Creating an ArrayList of Integer type
		ArrayList<Integer> numbers = new ArrayList<>();
        // 2. Adding elements to ArrayList
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(20); // duplicate values are allowed
		System.out.println("ArrayList after adding element : " + numbers);

		numbers.set(3, 200);
		System.out.println("Insert 200 at the thrid position in an ArrayList of numbers" + numbers);
		// 3. Removing an element (by value)
		numbers.remove(Integer.valueOf(20));
		System.out.println("After removing first occurence of 20: " + numbers);

		// 4. Removing an element (by index)
		numbers.remove(1);
		System.out.println("After removing element at Index 1 :" + numbers);

		// 5. Accessing elements using index
		System.out.println("Element at Index 1 : " + numbers.get(1));

		// 6. Checking the size of the ArrayList
		System.out.println("Size of ArrayList: " + numbers.size());

		// 7. Checking if an element exists
		if (numbers.contains(30)) {
			System.out.println("30 is present");
		} else {
			System.out.println("30 is not present");
		}

		// 8. Iterating over ArrayList elements
		System.out.println("Iterating over element: ");
		for (int num : numbers) {
			System.out.println(num);
		}

		// 9. Clearing the ArrayList
		numbers.clear();
		System.out.println("ArrayList after clear " + numbers);
	}

}
