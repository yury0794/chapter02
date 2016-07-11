package chapter02;

public class Student extends Person {
	public Student() {
		System.out.println("Student() called...");
	}

	public Student(int i) {
		System.out.println("Student(int i) called...");
	}

	public void showInfo() {
		System.out.println(age); // 부모의 default 접근 o (같은 패키지만)
		// System.out.println(name); 부모의 private 접근 x
		System.out.println(height); // 부모의 public 접근 o
		System.out.println(weight); // 부모의 protected 접근 o (자식만)
	}
}