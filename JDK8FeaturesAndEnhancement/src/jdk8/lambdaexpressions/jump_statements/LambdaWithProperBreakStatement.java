package jdk8.lambdaexpressions.jump_statements;

/** 
 *  @author Manish
 *  
 * We cannot use the jump statements to do non-local jump. 
 *
 */

import java.util.function.Function;

public class LambdaWithProperBreakStatement {

	public static void main(String[] argv) {
		Function<String, String> func1 = y -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				if (i == 4) {
					break;
				}
			}
			return y + "for loop stoped by break";
		};
		System.out.println(func1.apply("hi"));

	}
}