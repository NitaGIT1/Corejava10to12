package interfaces;

public class Car implements Vehicle, Fuel {

	@Override
	public void refuel(int liters) {
		System.out.println("Car refueled with " + liters + " liters.");

	}

	@Override
	public void start() {
		System.out.println("Car is starting with key ignition.");

	}

}
