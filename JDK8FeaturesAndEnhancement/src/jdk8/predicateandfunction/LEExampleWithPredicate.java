package jdk8.predicateandfunction;

import java.util.function.Predicate;

public class LEExampleWithPredicate {
	Predicate<Integer> predicate = (num) -> num < 0;
	Predicate<Integer> predicate1 = (num) -> num > 99;

	public static void main(String[] strArgs) {
		LEExampleWithPredicate le = new LEExampleWithPredicate();
		System.out.println(le.predicate.test(10));
		System.out.println(le.predicate.and(le.predicate).test(10));
	}
}
