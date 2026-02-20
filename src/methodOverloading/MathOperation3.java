package methodOverloading;

public class MathOperation3 {
	void show(String msg, int num) {
		System.out.println("String : " + msg + " num : " + num);
	}

	void show(int num, String msg) {
		System.out.println("num : " + num + " String : " + msg);
	}

}
