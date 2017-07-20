package jdk8.stream.stream_operation;

import java.util.Arrays;
import java.util.List;

/**
 * A map operation applies a function to each element to produce another stream.
 * 
 * @author manas
 */

public class B_StreamOperation_Map {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(numbers);
		
		numbers.stream()
			   .filter(n -> n % 2 == 0)
			   .map(n -> n * 2)
			   .forEach(System.out::println);	
	}
}
