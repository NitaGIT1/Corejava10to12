package interfaces;

public class MainECommerce {

	public static void main(String[] args) {
		ECommerce amz = new Amazon();
		amz.placeOrder("Bottle", 15);
		ECommerce flp = new Flipkart();
		flp.placeOrder("Chair", 5);

	}

}
