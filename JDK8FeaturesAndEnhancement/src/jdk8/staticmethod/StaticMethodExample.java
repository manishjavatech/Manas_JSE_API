package jdk8.staticmethod;

public interface StaticMethodExample {
	public static void staticMethod() {
		System.out.println("New Static method is added in interface");
	}
	
	public static void main(String[] args) {
		staticMethod();
	}
}