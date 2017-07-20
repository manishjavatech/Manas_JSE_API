package jdk8.defaultmethod;

public class DefaultMethodExampleImpl implements DefaultMethodExampleA,DefaultMethodExampleB{

	@Override
	public void newDefaultMethod() {
		DefaultMethodExampleB.super.newDefaultMethod();
		System.out.println("DefaultMethodExampleImpl default method"); 
	}

}
