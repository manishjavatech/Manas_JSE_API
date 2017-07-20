package jdk8.stream.stream_operation;

import java.util.List;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.stream.Stream;

public class Q_StreamOperation_FlatMap {
	public static void main(String[] args) {
		List<Integer> map = 
				Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
	            	  .flatMap(List::stream)
	            	  .map(integer -> integer)
	            	  .collect(toList());
		System.out.println(map);
				
		List<List<Integer>> flatMap=
				Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
					  .map(i -> i)
					  .collect(toList());
		System.out.println(flatMap);
	} 
}
