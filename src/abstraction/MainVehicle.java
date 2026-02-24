package abstraction;

public class MainVehicle {

	public static void main(String[] args) {
		Vehicle c1 = new Car();
		c1.move();
		c1.speed();
		Vehicle b1 = new Boat();
		b1.move();
		b1.speed();

	}

}
