
public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode =new Book();
	
	artOfComputerProgramming.read();
	effectiveJava.read();
	cleanCode.read();
	artOfComputerProgramming.setNoOfCopies(50);
	effectiveJava.setNoOfCopies(20);
	cleanCode.setNoOfCopies(70);
	}

}
