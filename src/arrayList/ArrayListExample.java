package arrayList;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> list = new ArrayList<String>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Print ArrayList
        System.out.println("ArrayList elements: " + list);

        // Get element
        System.out.println("First element: " + list.get(0));

        // Update element
        list.set(1, "Orange");

        // Remove element
        list.remove(2);

        // Size of ArrayList
        System.out.println("Size: " + list.size());

        // Iterate using loop
        for(String fruit : list) {
            System.out.println(fruit);
        }
    }
}