package constructors;

public class Circle {
	double radius;

	Circle() {
		radius = 10;
	}

	double calculateArea() {
		return 3.14 * radius * radius;

	}

	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("Area of circle is " + c1.calculateArea());
	}

}
