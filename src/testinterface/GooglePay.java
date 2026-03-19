package testinterface;

public class GooglePay implements PaymentApp{

	@Override
	public void pay(double amount) {
		System.out.println("payement through google pay: "+amount);
		
	}

}
