package arrays;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = {50,60,90}; 
		Student std = new Student("Ayush" , marks);
		//instead of creating marks variable separately,we can do refactor-->inline and use it only once,
		//in the place of arguments.With this we can even set different marks with different no. of elements
		//after this we get this
		//Student std = new Student("Ayush" , new int[] {50,60,90});
		
	    System.out.println("No. of Marks is :" + std.getNumberOfMarks());
		System.out.println("Sum Of Marks is :" + std.getTotalSumOfMarks());
		System.out.println("Maximum Mark is :" + std.getMaximumMark());
		System.out.println("Minimum Mark is :" + std.getMinimumMark());
		System.out.println("Average Mark is :" + std.getAverageMarks());
		}

}
