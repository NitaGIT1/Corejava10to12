package constructors;

public class Book {
	String title;
	String author;
	double price;

	Book() {
		title = "Testing fundamentals";
		author = "KP Sharma";
		price = 1000;
	}

	void displayDetails() {
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Price : " + price);
	}

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.displayDetails();
	}

}
