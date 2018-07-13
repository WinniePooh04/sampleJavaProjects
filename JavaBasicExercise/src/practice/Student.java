package practice;

public class Student extends Employee {

	private double salary;   // Annual salary
	private String name; 
	
	public double computePay() {
		System.out.println("Computing salary pay for " + getName());
	    return salary/52;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
