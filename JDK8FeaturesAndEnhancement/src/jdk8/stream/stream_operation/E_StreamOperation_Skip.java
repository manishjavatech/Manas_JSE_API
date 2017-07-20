package jdk8.stream.stream_operation;

import java.util.Arrays;
import java.util.List;

public class E_StreamOperation_Skip {
	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("1", "1", "2", "3", "4");

		stringList.stream()
				  .skip(2)
				  .forEach(System.out::println);
	}
}
