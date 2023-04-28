package arrayList;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student1 {
	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student1(String name, int... marks) {
	this.name = name;
	
	for(int mark:marks) {
		this.marks.add(mark);
	    }
	}
	
    public int getNumberOfMarks() {	
		return marks.size(); //to know the length, .size() is used 
	}

    public int getTotalSumOfMarks() {
		int sum = 0;
		for(int mark:marks) { 
		sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
	     return Collections.max(marks);
	}                                          //since array list comes under collections,we can use these
                                               //utility methods under collections
	public int getMinimumMark() {
		return Collections.min(marks);
		}

	public BigDecimal getAverageMarks() {
		return new BigDecimal(getTotalSumOfMarks()).divide(new BigDecimal(getNumberOfMarks()),3,RoundingMode.UP);
		//precision(up to how many decimal points)
	}
	public String toString() {     //toString method
		return name + marks;
	}
	
	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}
}
