package jdk8.methodreferences;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class GenericMethodReference {
	public static void main(String[] argv){
	    Function<Integer[],List<Integer>> asList = Arrays::<Integer>asList;
	    
	    System.out.println(asList.apply(new Integer[]{1,2,3,4,5}));
	  }
}
