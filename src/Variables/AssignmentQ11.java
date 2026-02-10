package Variables;

public class AssignmentQ11 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Values of a and b before swapping "+a+" "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Values of a and b after swapping "+a+" "+b);
    }

}
