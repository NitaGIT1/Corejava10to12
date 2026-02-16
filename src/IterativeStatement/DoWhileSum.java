package IterativeStatement;

public class DoWhileSum {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		do {
			sum = sum + i;
			System.out.println(sum);
			i++;
		} while (i <= 100);    //while (i >= 100); check with it
	}

}
