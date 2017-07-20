package jdk8.stream.stream_operation;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * We can collect data from a stream to a Map.
 * 
 * @author manas
 */

public class C_StreamOperation_CollectMap {
	public static void main(String[] args) {
		
		Map<String, String>  idToNameMap  = Arrays.asList("jdk-5", "jdk-6",  "jdk-7", "jdk-8")
		        									.stream()
		        									.collect(Collectors.toMap(k -> k, v -> v));
		        	
		System.out.println(idToNameMap);
		
		idToNameMap  = Arrays.asList("jdk-5", "jdk-5", "jdk-6",  "jdk-7", "jdk-8")
							 .stream()
							 .collect(Collectors.toMap(k -> k, v -> v,(ov,nv)-> nv));
		System.out.println(idToNameMap);
	}
}
