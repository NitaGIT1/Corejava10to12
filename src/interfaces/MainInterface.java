package interfaces;

public class MainInterface {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.refuel(10);
		b1.start();

		Car c1 = new Car();
		c1.refuel(35);
		c1.start();

	}

}
