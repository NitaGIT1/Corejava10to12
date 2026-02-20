package methodOverriding;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle v;
		v = new Car();
		v.speed();

		v = new Bike();
		v.speed();

	}

}
