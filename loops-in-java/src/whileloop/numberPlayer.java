package whileloop;

public class numberPlayer {

	private int limit;

	public numberPlayer(int limit) {
	this.limit = limit;
	}

	public void printSquaresUptoLimit(int number) {
      while(number * number <= limit) {
       System.out.print(number * number + " ");
       number++;
      }
      System.out.println();
	}

	public void pintCubesUptoLimit(int number) {
	while(number * number * number <= limit) {
		System.out.print(number * number * number + " ");
		number++;
	}
	System.out.println();
	}
}



