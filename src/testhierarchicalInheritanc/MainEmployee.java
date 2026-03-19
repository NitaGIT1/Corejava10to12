package testhierarchicalInheritanc;

public class MainEmployee {

	public static void main(String[] args) {
		Employee e1 = new Developer();
		e1.work();
		Employee e2 = new Tester();
		e2.work();
		Employee e3 = new Manager();
		e3.work();

	}

}
