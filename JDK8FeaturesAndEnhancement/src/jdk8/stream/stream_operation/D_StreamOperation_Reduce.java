package jdk8.stream.stream_operation;

/**
 *  @author M@n@s 
 * The reduce() operation combines all elements in a stream to produce a single value.
 */

import java.util.Arrays;
import java.util.List;

public class D_StreamOperation_Reduce {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream()
					     .filter(n -> n % 2 == 0)
					     .map(n -> n * 2)
					     .reduce(0, Integer::sum);
		System.out.println(sum);
	}
}
