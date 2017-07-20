package jdk8.stream.stream_operation;

import java.util.Arrays;
import java.util.List;

/** 
 * The filter operation produces a filtered stream, a subset of the input stream,
 * whose elements evaluate to true for the specified predicate.
 * 
 *  @author Manas
 */

public class A_StreamOperation_Filter {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(numbers);
		
	 numbers.stream()
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println);	;
		
		
	}
}
