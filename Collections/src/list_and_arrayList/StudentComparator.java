package list_and_arrayList;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{  //comparing using comparator 

	@Override
	public int compare(Student student1, Student student2) {
	
		return Integer.compare(student1.getId(), student2.getId());
	}

}
