package arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StudentVarArgs {

	private String name;
	private int[] marks;

	public StudentVarArgs(String name, int... marks) {
	this.name = name;
	this.marks = marks;
	}

	public int getNumberOfMarks() {
		
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for(int mark:marks) { 
		sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		int maxMark = Integer.MIN_VALUE;
		for(int Mark:marks) {
			if(Mark > maxMark) {
				maxMark = Mark;
			}
		}
		return maxMark;
	}

	public int getMinimumMark() {
		int minMark = Integer.MAX_VALUE;
		for(int Mark:marks) {
			if(Mark < minMark) {
				minMark = Mark;
	}
		}
			return minMark;
		}

	public BigDecimal getAverageMarks() {
		return new BigDecimal(getTotalSumOfMarks()).divide(new BigDecimal(getNumberOfMarks()),3,RoundingMode.UP);
		//precision(up to how many decimal points)
	}
}
