package jdk8.stream.stream_operation;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * The joining() method from Collectors class returns a collector that
 * concatenates the stream of CharSequence and returns the result as a String.
 * 	joining()
 *    concatenates all elements
 *  joining(CharSequence delimiter)
 *    uses a delimiter to be used between two elements.
 *  joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
 *    uses a delimiter, a prefix and a suffix. The prefix is added to the beginning and the suffix is added to the end.
 * 
 * @author manas
 */

public class I_StreamOperation_Join {
	public static void main(String[] args) {
		String collectJoin = Arrays.asList("jdk-5", "jdk-6",  "jdk-7", "jdk-8")
								   .stream()
								   .collect(Collectors.joining());
		System.out.println(collectJoin);
		
		collectJoin = Arrays.asList("jdk-5", "jdk-6",  "jdk-7", "jdk-8")
				   .stream()
				   .collect(Collectors.joining(", "));
		System.out.println(collectJoin);
		
		collectJoin = Arrays.asList("jdk-5", "jdk-6",  "jdk-7", "jdk-8")
				   .stream()
				   .collect(Collectors.joining(", ","Hi "," Bye"));
		System.out.println(collectJoin);
	}
}
