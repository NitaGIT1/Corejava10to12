package stringExample;

public class ReplaceString {

	public static void main(String[] args) {
		String str = "apple";
		String modified1 = str.replace('a', 'o');
		System.out.println(modified1);

		String sentence = "I like apple pie!";
		String modified2 = sentence.replace("apple", "orange");
		System.out.println(modified2);

	}

}
