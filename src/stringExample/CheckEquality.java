package stringExample;

public class CheckEquality {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "hello";
		System.out.println("Using equals(): " + str1.equals(str2));
		System.out.println("Using equalsIgnoreCase(): " + str2.equalsIgnoreCase(str2));
	}
}
