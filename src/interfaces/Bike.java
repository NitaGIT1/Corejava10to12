package interfaces;

public class Bike implements Vehicle, Fuel {

	@Override
	public void refuel(int liters) {
		System.out.println("Bike refueled " + liters + " liters.");

	}

	@Override
	public void start() {
		System.out.println("Bike is starting with self-start button.");

	}

}
