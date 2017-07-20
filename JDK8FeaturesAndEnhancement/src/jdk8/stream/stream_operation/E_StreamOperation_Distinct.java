package jdk8.stream.stream_operation;

import java.util.Arrays;
import java.util.List;

public class E_StreamOperation_Distinct {
   public static void main(String[] args) {
	   List<String> stringList = Arrays.asList("1","1","2","3","4");

	    stringList.stream()
	           .distinct()
	           .forEach(System.out::println);
   }
}
