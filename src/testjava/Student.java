package testjava;

public class Student {

	String name;
	int rollNo;
	int marks;

	Student(String name, int rollNo, int marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	void displayStudent() {
		System.out.println("student name: " + name);
		System.out.println("student rollNO: " + rollNo);
		System.out.println("student Marks: " + marks);

	}

	public static void main(String[] args) {
		Student s1 = new Student("nita", 11, 80);
		Student s2=new Student ("Pankaj", 12,800);
	    s1.displayStudent();
	    s2.displayStudent();

	}

}
