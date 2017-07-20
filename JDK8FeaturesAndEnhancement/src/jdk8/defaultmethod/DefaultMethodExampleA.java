package jdk8.defaultmethod;

public interface DefaultMethodExampleA {
	default public void newDefaultMethod() {
		System.out.println("DefaultMethodExampleA default method"); 
	}
}
