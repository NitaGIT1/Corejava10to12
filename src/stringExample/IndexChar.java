package stringExample;

public class IndexChar {

	public static void main(String[] args) {
		String str = "Java is fun!";
		System.out.println("Character at index 5: " + str.charAt(5));
		char lastChar = str.charAt(str.length() - 1);
		System.out.println("Last Character: " + lastChar);

	}

}
