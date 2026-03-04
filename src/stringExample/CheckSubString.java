package stringExample;

public class CheckSubString {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		if (str1.contains("Pro")) {
			System.out.println("Contains Pro");
		} else {
			System.out.println("Does not contain Pro");
		}

		String str2 = "Hello, World!";
		if (str2.contains("world")) {
			System.out.println("Contains world");

		} else {
			System.out.println("Does not contain world");
		}

	}

}
