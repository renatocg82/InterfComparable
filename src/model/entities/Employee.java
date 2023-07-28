package model.entities;

public class Employee implements Comparable<Employee>{
	
	String name;
	Double salary;
	
	public Employee() {
		
	}
	
	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.salary.compareTo(o.getSalary());
	}
	
}
