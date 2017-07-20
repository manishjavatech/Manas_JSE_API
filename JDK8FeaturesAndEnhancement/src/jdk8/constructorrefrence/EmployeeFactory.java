package jdk8.constructorrefrence;

public interface EmployeeFactory {
	public abstract Employee getEmployee(String name, Integer age);
}