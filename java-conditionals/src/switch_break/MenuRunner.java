package switch_break;
import java.util.Scanner;

public class MenuRunner {

public static void main(String[] args) {
	//Type object = new Type(argument);6
Scanner scanner = new Scanner(System.in);

System.out.print("Enter number1 : ");
int number1 = scanner.nextInt();  

System.out.print("Enter number2 : ");
int number2 = scanner.nextInt();

System.out.println("Choices available are");
System.out.println("1. Add");
System.out.println("2. Subtract");
System.out.println("3. Multiply");
System.out.println("4. Divide");

System.out.print("Enter your choice: ");
int choice = scanner.nextInt();

System.out.println("Your choices are:");
System.out.println("number1: " + number1);  //here + is used to append string to numbers
System.out.println("number2: " + number2); 
System.out.println("choice: " + choice); 

switch(choice) {
case 1 : System.out.println("Result: " + (number1 + number2));
break;
case 2 : System.out.println("Result: " + (number1 - number2));
break;
case 3 : System.out.println("Result: " + (number1 * number2));
break;
case 4 : System.out.println("Result: " + (number1 / number2));
break;
default : System.out.println("Invalid Operation: Please try again.");
break;
}

//we can also use else if condition
//if(choice==1) {
	//System.out.println("Result: " + (number1 + number2)); 
//}else if(choice==2) {
	//System.out.println("Result: " + (number1 - number2));
//}else if(choice==3) {
		//System.out.println("Result: " + (number1 * number2));
//}else if(choice==4) {
	//System.out.println("Result: " + (number1 / number2));
//}else {
	//System.out.println("Invalid Operation: Please try again.");
}
}
//}
