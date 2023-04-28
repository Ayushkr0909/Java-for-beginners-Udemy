package list_and_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Ranga"),
				                         new Student(2, "Adam"),
				                         new Student(3, "Eve"));
		
		List<Student> studentsAl = new ArrayList<>(students);  //since we need to sort ,we can't do it with List,so we create ArrayList
		                                                       //can use LinkedList or vector too instead of ArrayList
		System.out.println(studentsAl);
	
		Collections.sort(studentsAl);	
		System.out.println("Dsc order" + studentsAl);
			
		//Collections.sort(studentsAl, new StudentComparator());  //for comparator class
		//or
		studentsAl.sort(new StudentComparator());
		System.out.println("Asc order" + studentsAl);
			}
	}

