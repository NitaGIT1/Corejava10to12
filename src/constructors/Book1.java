package constructors;

public class Book1 {

	String title;
	String author;
	double price;

	Book1(String title, String author, double price) { //book1(String t, String a, double p)
		this.title = title;               //title = t;
		this.author = author;
		this.price = price;

	}

	void displayDetails() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}

	public static void main(String[] args) {
		Book1 b1 = new Book1("Testing fundamentals", "Kp sharma", 2000);
		Book1 b2 = new Book1("Testing", "sharma", 5000);
		b1.displayDetails();
		b2.displayDetails();
	}

}
