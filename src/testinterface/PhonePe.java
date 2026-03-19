package testinterface;

public class PhonePe implements PaymentApp{

	@Override
	public void pay(double amount) {
		System.out.println("payement through phone pay: "+amount);
		
	}

}
