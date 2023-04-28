
public class Book {
	//state of instances
	private int noOfCopies; //member variable
	//method
	void setNoOfCopies(int noOfCopies) { //local variable
		//this.noOfCopies = noOfCopies; 
		System.out.println(noOfCopies); //prints the local variable value
		System.out.println(this.noOfCopies); //prints the member variable value
		this.noOfCopies = noOfCopies; //sets the value of local variable to member variable
	
	}
       void read() {
    	   System.out.println("Book read");
}
}
//if this.noOfCopies is after System.out.println(this.noOfCopies); then it will return 0
//as value is not assigned to it