package jdk8.lambdaexpressions.scope;

import java.util.function.Function;

public class JavaLambdaScope {

	String msg = "Instance Scope";

	public JavaLambdaScope() {
		
		Function<String, String> func1 = str -> {
			String msg = "local Scope";
			System.out.println(this);
			System.out.println(msg);
			System.out.println(this.msg);
			return str;
		};
		func1.apply("");
	}

	public static void main(String[] argv) {
		new JavaLambdaScope();
	}
}
