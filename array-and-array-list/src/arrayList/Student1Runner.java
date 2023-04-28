package arrayList;

public class Student1Runner {

	public static void main(String[] args) {
		int[] marks = {50,60,90}; 
		Student1 std = new Student1("Ayush" , marks);
		
		System.out.println("No. of Marks is :" + std.getNumberOfMarks());
		System.out.println("Sum Of Marks is :" + std.getTotalSumOfMarks());
		System.out.println("Maximum Mark is :" + std.getMaximumMark());
		System.out.println("Minimum Mark is :" + std.getMinimumMark());
		System.out.println("Average Mark is :" + std.getAverageMarks());
		std.addNewMark(50);
		std.removeMarkAtIndex(2);
		System.out.println(std);

	}

}
