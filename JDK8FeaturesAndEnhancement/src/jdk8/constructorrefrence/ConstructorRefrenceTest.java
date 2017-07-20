package jdk8.constructorrefrence;

public class ConstructorRefrenceTest {
	public static void main(String[] args) {
		EmployeeFactory empFactory=Employee::new;
		Employee emp= empFactory.getEmployee("Manish",1225);
		System.out.println(emp.toString());
	}
}
