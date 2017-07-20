package jdk8.lambdaexpressions.parameterization_ambiguity;

public class LambdaParameterizationAmbiguity {

	private static void calculation(IntCalculator calculator) {
		int x = 2, y = 4;
		int result = calculator.calculate(x, y);
		System.out.println(result);
	}

	private static void calculation(LongCalculator calculator) {
		long x = 2, y = 4;
		long result = calculator.calculate(x, y);
		System.out.println(result);
	}

	public static void main(String[] argv) {
		calculation((int x, int y) -> x + y);
		// calculation((x, y)-> x + y);
		// calculation((IntCalculator)(x, y)-> x + y);
		calculation((LongCalculator) (x, y) -> x + y);
	}

}
