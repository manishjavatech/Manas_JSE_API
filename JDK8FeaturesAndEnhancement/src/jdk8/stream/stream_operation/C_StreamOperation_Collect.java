package jdk8.stream.stream_operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;


/**
 * To group data in a Stream we can use collect() method of the Stream<T> interface. 
 * collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R,R> combiner) 
 *   A supplier that supplies a mutable container to store the results.
 *   An accumulator that accumulates the results into the mutable container. 
 *   A combiner that combines the partial results when used in parallel.
 * 
 * @author manas
 *
 */

public class C_StreamOperation_Collect {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(numbers);
		
		numbers = numbers.stream()
						 .filter(n -> n % 2 == 0)
						 .map(n -> n * 2)
						 //.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
						.collect(toList());
		System.out.println(numbers);
	}
}
