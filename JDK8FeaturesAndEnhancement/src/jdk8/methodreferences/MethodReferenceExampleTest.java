package jdk8.methodreferences;

public class MethodReferenceExampleTest {
	public static void main(String[] args) {
		Arithmetic arithmetic = (x, y) -> Math.max(x, y);
		System.out.println(arithmetic. maximum(10,11));
		
		arithmetic = java.lang.Math::max;	
		System.out.println(arithmetic. maximum(10,9));
		
		MethodReferenceExample methodReferenceExample = new MethodReferenceExample();
		arithmetic=methodReferenceExample::maximum;
		System.out.println(arithmetic.maximum(50, 60));
	}
}
