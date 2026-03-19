package testOverloading;

public class Display {
	public void show(int num) {
		System.out.println("integer display num: " + num);
	}

	public void show(String name) {
		System.out.println("String display name: " + name);
	}

	public void show(double value) {
		System.out.println("String display double: " + value);
	}

	public static void main(String args[]) {
		Display d = new Display();
		d.show(200);
		d.show("Nita");
		d.show(2000000);

	}

}
