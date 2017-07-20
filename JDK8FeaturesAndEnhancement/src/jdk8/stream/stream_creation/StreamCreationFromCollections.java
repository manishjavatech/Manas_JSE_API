package jdk8.stream.stream_creation;

import java.util.Arrays;

public class StreamCreationFromCollections {
	public static void main(String[] args) {
		Arrays.stream(new String[] {"jdk-5, ", "jdk-6, ",  "jdk-7, ", "jdk-8"})
			  .forEach(System.out::print);
		
		System.out.println();
		
		Arrays.asList(new String[] {"jdk-5, ", "jdk-6, ",  "jdk-7, ", "jdk-8"})
			  .stream()
			  .forEach(System.out::print);
		
		System.out.println();
		
		Arrays.asList(new String[] {"jdk-5, ", "jdk-6, ",  "jdk-7, ", "jdk-8"})
		  .parallelStream()
		  .forEach(System.out::print);
	}
}
