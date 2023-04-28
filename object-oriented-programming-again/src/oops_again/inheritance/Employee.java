package oops_again.inheritance;

public class Employee extends Student{
	
	//adding new fields to employee class
	private String title;
	private String employer;
	private String employeeGrade;
	private int salary;
	
	public Employee(String branch) {
		//since student class have constructor with argument as branch,we must explicitly 
        //call super class constructor in all the sub class constructors
		super(branch);  
		System.out.println("Employee Constructor");
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public String getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString() {
	  return super.toString() + " " + title + " " + employer + " " + employeeGrade + " " + salary;
	  
	}

}
