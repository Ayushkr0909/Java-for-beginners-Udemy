package javafirstproject;

//to print 5*1=5 to 5*10=50
public class MultiplicationTable {
	
	void print() {             //method that doesn't ask for any parameter from user
		print(5,1,10);         //invoking print(int n, int from, int to) method
	}

    void print(int n) {        //method that ask for n value from the user
	print(n,1,10);             //invoking print(int n, int from, int to) method
	}

    void print(int n,int from,int to) {         //method that ask for n, from, to values from the user
	   for(int i=from;i<=to;i++) {
	       System.out.printf("%d*%d=%d",n,i,n*i).println();
	}
}
}