package constructors;

public class Person {

	String name;
	int age;

	Person() {
		 name = "Nita";
		 age = 25;
	}

	public void greet() {
		System.out.println("Hello my name is " + name + " and my age is " + age);

	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.greet();

	}

}
