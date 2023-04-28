package oops_again.object_composition;

public class Customer {
	//state
      private String name;
      private Address homeAddress;  //taking Address as a separate class inside Customer class
      private Address workAddress;
      
    //constructor : which are mandatory
      public Customer(String name, Address homeAddress) {
    	  this.name = name;
    	  this.homeAddress = homeAddress;
      }

  //operations : we need operations to be done on workAddress or change it if we need using getters & setters
	              //setters and getters are done if a state is not included in constructor 
	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	
public String toString() {
	return String.format("name - %s, homeAddress - %s, workAddress - %s",name, homeAddress, workAddress);
}
}
//constructors are created for fields that you want to keep mandatory and for them getters and setters are not
                                                                                                 //defined
