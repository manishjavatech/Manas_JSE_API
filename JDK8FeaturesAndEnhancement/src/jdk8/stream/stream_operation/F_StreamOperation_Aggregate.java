package jdk8.stream.stream_operation;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class F_StreamOperation_Aggregate {
	public static void main(String[] args) {
		long count = Arrays.asList(1, 2, 3, 4, 5)
						   .stream()
						   .count();
		System.out.println("Count: " + count);
		
		int sum = Arrays.asList(1, 2, 3, 4, 5)
				        .stream()
				        .filter(n -> n % 2 == 0)
				        .mapToInt(n -> n * n)
				        .sum();
		System.out.println("Sum: " + sum);
		
		OptionalDouble averageOptional = Arrays.asList(1, 2, 3, 4, 5)
									   .stream()
									   .filter(n -> n % 2 == 0)
									   .mapToInt(n -> n * n)
									   .average();
		System.out.println("Average: " + averageOptional.getAsDouble());
		
		OptionalInt maxOptional = Arrays.asList(1, 2, 3, 4, 5)
				   .stream()
				   .filter(n -> n % 2 == 0)
				   .mapToInt(n -> n * n)
				   .max();
		System.out.println("Max: " + maxOptional.getAsInt());
		
		OptionalInt minOptional = Arrays.asList(1, 2, 3, 4, 5)
				   .stream()
				   .filter(n -> n % 2 == 0)
				   .mapToInt(n -> n * n)
				   .max();
		System.out.println("Min: " + minOptional.getAsInt());
	}
}
