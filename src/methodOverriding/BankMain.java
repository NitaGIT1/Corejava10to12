package methodOverriding;

public class BankMain {

	public static void main(String[] args) {
		Bank b;
		b = new SBI();
		System.out.println("SBI rate of interest is : " + b.getRateOfInterest());
		b = new ICICI();
		System.out.println("ICICI rate of interest is : " + b.getRateOfInterest());
		b = new Axis();
		System.out.println("Axis rate of interest is : " + b.getRateOfInterest());

	}

}
