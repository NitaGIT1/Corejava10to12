package constructors;

public class Car {
	String make;
	String model;
	int year;

	Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	void displayCarInfo() {
		System.out.println("Make : " + make);
		System.out.println("Model : " + model);
		System.out.println("Year : " + year);
		// System.out.println(make + " " + model + " " + year);
	}

	public static void main(String[] args) {
		Car c1 = new Car("BMW", "s5", 2025);
		Car c2 = new Car("AUDI", "Q3", 2022);
		c1.displayCarInfo();
		c2.displayCarInfo();

	}

}
