package chapter02;

public class Person {
	public Person() {
		System.out.println("Person() called...");
	}
	
	public Person(int i) {
		System.out.println("Person(int i) called...");
	}

	int age;
	private String name;
	public int height;
	protected int weight;
}