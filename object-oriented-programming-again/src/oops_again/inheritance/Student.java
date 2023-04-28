package oops_again.inheritance;

public class Student extends Person{
	
	//new fields are added to student class
	private int rgdNo;
	private String branch;
	
	public Student(String branch) {        //branch is taken mandatory
		System.out.println("Student Constructor");
		this.branch = branch;
	}
	public int getRgdNo() {
		return rgdNo;
	}
	public void setRgdNo(int rgdNo) {
		this.rgdNo = rgdNo;
	}
	public String getBranch() {
		return branch;
	}
	
	public String toString(){
	return super.getName() + " " +super.getEmail() + " " + rgdNo + " " + branch;
	}
	//super.toString() is used to print all the super class details
	//super.getmethod is used for printing the details of super class u want eg. super.getRgdNo
	}
	

