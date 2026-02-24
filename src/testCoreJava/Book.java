package testCoreJava;

public class Book {

	String title;
	String author;
	double price;

	Book(String t, String a, double p) {
		title = t;
		author = a;
		price = p;

	}

	void displayDetails() {
		System.out.println(" Title = " + title);
		System.out.println(" Author = " + author);
		System.out.println(" Price = " + price);
	}

	public static void main(String[] args) {
		Book b1 = new Book("Software testing ", "R K Sharma", 1000);
		 b1. displayDetails();
		Book b2 = new Book("Software Developer ", "K P  Sharma", 2000);
		b2.displayDetails();
		
	}

}
