package jdk8.predicateandfunction;

import java.util.function.Function;

public class LEExampleWithFunction {
	Function<String, Boolean> function = (str) -> "XYZ".equals(str);

	public static void main(String[] strArgs) {
		LEExampleWithFunction le = new LEExampleWithFunction();
		System.out.println(le.function.apply("test"));
	}
}
