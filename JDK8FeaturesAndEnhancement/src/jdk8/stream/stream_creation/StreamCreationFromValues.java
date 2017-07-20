package jdk8.stream.stream_creation;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationFromValues {
	public static void main(String[] args) {
		Stream<String> stream  = Stream.of("ggk Tech");
	    stream.forEach(System.out::println);
	    
	    Stream<Integer> intStream = Stream.of(10,11);
	    intStream.forEach(System.out::println);
	    
	    stream  = Stream.of("jdk-5", "jdk-6",  "jdk-7", "jdk-8");
	    stream.forEach(System.out::println);
	    
	    /*String[] names = { "jdk-5", "jdk-6",  "jdk-7", "jdk-8" };
	    stream = Stream.of(names);
	    stream.forEach(System.out::println);*/
	    
	    /*stream  = Stream.<String>builder()
	            .add("jdk-5")
	            .add("jdk-6")
	            .add("jdk-7")
	            .add("jdk-8")
	            .build();
	   stream.forEach(System.out::println);*/
	   
	   /*IntStream oneToFive  = IntStream.range(1, 6);
	    //IntStream oneToFive  = IntStream.rangeClosed(1, 5);
	    oneToFive.forEach(System.out::println);*/
	    
	  /*stream  = Stream.empty();
	  stream.forEach(System.out::println);*/
	}
}
