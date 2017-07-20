package jdk8.lambdaexpressions.intersection_type;

/**
 * 
 * @author manas
 *
 *An intersection type is an intersection of multiple types.
 *An ampersand is used between two types as Type1 & Type2 to represent a new type that is an intersection of Type1, Type2.
 */
public class LambdaIntersectionType {
	public static void main(String[] args) {
		NonFunctional nonFunctional = (NonFunctional & Calculator) (x,y)-> x + y;
		java.io.Serializable ser = (java.io.Serializable & Calculator) (x,y)-> x + y;
	}
	

}
