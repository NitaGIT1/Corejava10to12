package abstraction;

public class MainPayment {

	public static void main(String[] args) {
		Payment crd = new CreditCardPayment();
		crd.makePayment(20000);
		
		Payment upi = new UPIPayment();
		upi.makePayment(1000);

	}

}
