package arrays;

public class StudentVarArgsRunner {

	public static void main(String[] args) {
		StudentVarArgs std1 = new StudentVarArgs("Ayush" , 95,60);
		StudentVarArgs std2 = new StudentVarArgs("Ayush" , 95,60,50);
		StudentVarArgs std3 = new StudentVarArgs("Ayush" , 95,60,40,100);
		
	    System.out.println("No. of Marks for std1 is :" + std1.getNumberOfMarks());
		System.out.println("Sum Of Marks for std1 is:" + std1.getTotalSumOfMarks());
		System.out.println("Maximum Mark for std1 is :" + std1.getMaximumMark());
		System.out.println("Minimum Mark for std1 is :" + std1.getMinimumMark());
		System.out.println("Average Mark for std1 is :" + std1.getAverageMarks());
		System.out.println();
		
		System.out.println("No. of Marks for std2 is :" + std2.getNumberOfMarks());
		System.out.println("Sum Of Marks for std2 is :" + std2.getTotalSumOfMarks());
		System.out.println("Maximum Mark for std2 is :" + std2.getMaximumMark());
		System.out.println("Minimum Mark for std2 is :" + std2.getMinimumMark());
		System.out.println("Average Mark for std2 is :" + std2.getAverageMarks());
		System.out.println();
		
		System.out.println("No. of Marks for std3 is :" + std3.getNumberOfMarks());
		System.out.println("Sum Of Marks for std3 is :" + std3.getTotalSumOfMarks());
		System.out.println("Maximum Mark for std3 is :" + std3.getMaximumMark());
		System.out.println("Minimum Mark for std3 is :" + std3.getMinimumMark());
		System.out.println("Average Mark for std3 is :" + std3.getAverageMarks());
		System.out.println();

	}

}
