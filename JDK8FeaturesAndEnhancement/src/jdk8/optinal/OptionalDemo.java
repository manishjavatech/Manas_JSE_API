package jdk8.optinal;

import java.util.Optional;

public class OptionalDemo {
	
	
	
	public static void main(String[] args) {
		Optional<String> str = Optional.of("ggk");

	    if (str.isPresent()) {
	      String value = str.get();
	      System.out.println("Optional contains " + value);
	    } else {
	      System.out.println("Optional is  empty.");
	    }
	  }
}
