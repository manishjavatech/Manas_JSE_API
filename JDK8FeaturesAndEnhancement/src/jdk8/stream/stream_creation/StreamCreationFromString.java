package jdk8.stream.stream_creation;

import java.util.regex.Pattern;

public class StreamCreationFromString {
    public static void main(String[] args) {
    	String stream = "jdk-8";
    	stream.chars()
        .forEach(ch -> System.out.println((char)ch));
        
    	stream = "jdk-5,jdk-6,jdk-7,jdk-8"; 
        Pattern.compile(",")
        	   .splitAsStream(stream)
        	   .forEach(System.out::println);
	}
}
