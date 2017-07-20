package jdk8.lambdaexpressions.foreach;

import java.util.Arrays;
import java.util.List;

public class DiplayListUsingLambda {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(10,11,12,13);
		for(Integer value : values){
			System.out.println(value);
		}
		
		//values.forEach(i -> System.out.println(i));
		//values.forEach( System.out::println);
	}
}
