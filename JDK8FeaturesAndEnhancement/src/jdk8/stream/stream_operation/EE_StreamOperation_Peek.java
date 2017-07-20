package jdk8.stream.stream_operation;

import java.util.stream.Stream;

/**
 * @author M@n@s
 *
 *	We can debug a stream by using the peek
 *  We can use a lambda expression with the peek() method to log elements.
 */
public class EE_StreamOperation_Peek {
	public static void main(String[] args) {
		int sum = Stream.of(1, 2, 3, 4, 5)
		        .peek(e -> System.out.println("Taking integer: " + e))
		        .filter(n -> n % 2 == 0)
		        .peek(e -> System.out.println("Filtered integer: " + e))
		        .map(n -> n).peek(e -> System.out.println("Mapped integer: " + e))
		        .reduce(0, Integer::sum);
		    System.out.println("Sum = " + sum);
	}
}
