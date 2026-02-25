package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ColoursList {

	public static void main(String[] args) {

		ArrayList<String> colours = new ArrayList<>();

		colours.add("Red");
		colours.add("Blue");
		colours.add("Green");
		colours.add("Yellow");

		System.out.println("ArrayList after adding colour list: " + colours);

		System.out.println("Element at index 2: " + colours.get(2));

		colours.set(2, "Purple");
		System.out.println("After updating 2 element as purple: " + colours);

		colours.remove("Blue");
		System.out.println("After removing index 1: " + colours);

		System.out.println("Whole ArrayList: " + colours);

		Collections.sort(colours);
		System.out.println("After sorting in alphabatical order: " + colours);

		Collections.reverse(colours);
		System.out.println("After reverse: " + colours);

		// Iterate through an ArrayList using a for-each loop
		System.out.println("Iterating over element: ");
		for (String colour : colours) {
			System.out.println(colour);
		}

	}

}
