package jdk8.constructorrefrence;

public class Employee {
	String name;
	Integer age;

	public Employee(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
}
