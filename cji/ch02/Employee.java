package ch02;

public class Employee {
	
	private String name;
	private double salary;

	private static int lastId = 0;
	private int id;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public Employee(double salary) {
		this("", salary);
	}

	public Employee() {
		this("", 0);
		lastId++;
		id = lastId;
	}

	/**
	 * Raise the salary of an employee.
	 * @param byPercent the percentage by which to raise
	 * @return the amount of the raise
	 */
	public void raiseSalary(double byPercent) {
		double raise = this.salary * byPercent / 100;
		this.salary += raise;
	}

	public String getName() {
		return name;
	}
}