package stringExample;

public class DemoString {

	public static void main(String[] args) {
		
		String str = "  Hello World  ";
		
		// String length
		System.out.println("Length: " + str.length());
		
		
		// Trim spaces
		System.out.println("Trimmed: '" + str.trim() + "'");
		
		
		// Convert to uppercase
		System.out.println("Uppercase: " + str.toUpperCase());
		
		
		// Convert to lowercase
		System.out.println("Lowercase: " + str.toLowerCase());
		
		
		// Get character at index 1
		System.out.println("Char at index 1: " + str.charAt(1));
		
		
		// Substring from index 2 to 7
		System.out.println("Substring (2,7): " + str.substring(2, 7));
		
		
		// Replace characters
		System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
		
		
		// Check if string contains "Hello"
		System.out.println("Contains 'Hello': " + str.contains("Hello"));
		
		
		// String comparison
		String str2 = "hello world";
		System.out.println("Equals (case-sensitive): " + str.equals(str2));
		System.out.println("Equals (ignore case): " + str.equalsIgnoreCase(str2));
		
		
		// Splitting string
		String words[] = str.trim().split(" ");
		System.out.println("Splitted words:");
		for (String word : words) {
			System.out.println(word);
		}
	}
}
