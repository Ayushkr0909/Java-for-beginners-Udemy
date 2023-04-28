package dowhileloop;

import java.util.Scanner;

public class cubeUntilNegativeInputRunner {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int number = -1;
	do {
		if(number > -1) {
	System.out.println("The cube of the number is " + (number * number * number));
		}
	System.out.print("Enter a number ");
	number = scanner.nextInt();
	}while(number >= 0);
	System.out.print("Thank you!!Have fun! ");
	}

}
