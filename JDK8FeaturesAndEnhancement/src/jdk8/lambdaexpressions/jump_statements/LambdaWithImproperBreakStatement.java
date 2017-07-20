package jdk8.lambdaexpressions.jump_statements;

import java.util.function.Function;

/**
 * @author Manish
 * 
 * We cannot use break statement in the lambda expression in order to
 * jump out to a for loop outside lambda expression.
 */

public class LambdaWithImproperBreakStatement {
	public static void main(String[] argv) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 4) {

				Function<String, String> func1 = y -> {
					// break;
					return y + "for loop stoped by break";
				};
				System.out.println(func1.apply("hi"));

			}
		}

	}
}
