package jdk8.lambdaexpressions.recursive;

import java.util.function.Function;

/** 
 * @author Manish
 * We can use a method reference when creating a recursive lambda expressions.
 */

public class RecursiveLambdaExample {

	public static String reverse(String str) {
		if ((str == null) || (str.length() <= 1))
			return str;
		return reverse(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		Function<String, String> stringReverse = RecursiveLambdaExample::reverse;
		System.out.println(stringReverse.apply("Manish"));
	}
}