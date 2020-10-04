package Overriding;

public class Base {
	public static void display() {
		// Static method in base class which will be hidden in subclass
		System.out.println("Static method from Base class");
	}
	// Non-static method which will be overridden in derived class
	public void print() {
		System.out.println("Non-static or Instance method from Base");
	}
}
