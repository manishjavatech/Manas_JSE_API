package jdk8.stream.stream_creation;

import java.util.stream.Stream;

public class StreamCreationFromFuntion {
	public static void main(String[] args) {
		Stream.iterate(1L, n -> n + 1)
			  .limit(5)
			  .forEach(System.out::println);

		Stream.generate(Math::random)
			  .limit(5)
			  .forEach(System.out::println);
	}
}
