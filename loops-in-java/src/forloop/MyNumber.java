package forloop;
public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {		
		if(number < 2) {  //negative numbers,0 and 1 is not prime
			return false;
		}
		
		for(int n = 2; n <= (number - 1); n++) {
		if(number % n == 0) {
			return false;
	}
		}
			return true;
}

	public int sumUptoN() {
	int sum = 0;
	for(int i = 1; i <= number; i++) {
	sum = sum + i;
	}
	return sum;
}

	public int sumOfDivisors() {
	int sum = 0;
	for(int i = 2; i< number; i++) { //sum of divisors except 1 and the number
	if(number % i == 0) {
		sum = sum + i;
	}
	}
	return sum;
}

	public void printNumberTriangle() {
	for(int i = 1; i <= number; i++) {
		for(int j = 1; j <= i; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
}
}

