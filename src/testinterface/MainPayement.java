package testinterface;

public class MainPayement {

	public static void main(String[] args) {
		PaymentApp p1 = new GooglePay();
		p1.pay(20000);
		PaymentApp p2 = new PhonePe();
		p2.pay(50000);

	}

}
