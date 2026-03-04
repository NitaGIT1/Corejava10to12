package stringExample;

public class SplitExample {

	public static void main(String[] args) {
		String sentence = "I am learning Java programming";
		String[] words = sentence.split(" ");
		for (String word : words) {
			System.out.println(word);
		}

	}

}
