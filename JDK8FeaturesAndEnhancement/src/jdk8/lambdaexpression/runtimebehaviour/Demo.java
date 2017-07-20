package jdk8.lambdaexpression.runtimebehaviour;

public class Demo {

	
	static DemoInf inf2=() -> System.out.println();
	static DemoInf inf3=() -> System.out.println();
	
	public void m2() {
		for(int i=0;i<2;i++){
			DemoInf inf1=() -> System.out.println();
			System.out.println(inf1);
			System.out.println((DemoInf)() -> System.out.println());
			
		}
		
	}

	public static void m3() {
		System.out.println(inf2);
	}

	public static void foobar() {
		System.out.println((Runnable) Demo::foobar);
		System.out.println((Runnable) () -> System.out.println());
	}
	
	public static void main(String... args) {
		//foobar();
		//foobar();
		//System.out.println((Runnable) Demo::foobar);
		//new Demo().m2();
		//new Demo().m2();
		//m3();
		//m3();
		System.out.println(inf2);
		System.out.println(inf3);
	}
}