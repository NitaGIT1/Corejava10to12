package stringExample;

public class Concatenation {

	public static void main(String[] args) {
		String firstName = "Pankaj";
		String lastName = "Kolhe";

		String fullName = firstName.concat(" ").concat(lastName);
		System.out.println(fullName);
		String greeting = "Hello ".concat(firstName);
		System.out.println(greeting);

	}

}
