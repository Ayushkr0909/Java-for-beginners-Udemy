package oops_again.inheritance;

public class EmployeeRunner {

	public static void main(String[] args) {
      Employee stud = new Employee("Mechanical");
      stud.setName("Ayush");
      stud.setEmail("goldy984007@gmail.com");
      stud.setRgdNo(1801227144);
      stud.setTitle("Advisor");
      stud.setEmployer("Dr.Dhoni");
      stud.setEmployeeGrade("Class A");
      stud.setSalary(50000);

      System.out.println(stud);
	}

}
