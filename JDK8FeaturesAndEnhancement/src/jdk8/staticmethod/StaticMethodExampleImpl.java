package jdk8.staticmethod;

public class StaticMethodExampleImpl {
	//@Override
	public static void staticMethod() {
		System.out.println("New Static method is added in StaticMethodExampleImpl");
	}
	public static void main(String[] args) {
		staticMethod();
		StaticMethodExample.staticMethod();
	}
}
