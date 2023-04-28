package forloop;
public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(5);
		
boolean isPrime = number.isPrime(); //storing method in a variable
System.out.println("isPrime " + isPrime);  //calling the variable

System.out.print("Sum of the numbers is ");
System.out.println(number.sumUptoN());  //directly calling the method

System.out.println("Sum of divisors is " + number.sumOfDivisors());  //appending the method along with message

number.printNumberTriangle();
}
}

