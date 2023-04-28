package oops_again.object_composition;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("Pachna Road", "Lakhisarai", "811311");
		Customer customer = new Customer("Ayush", homeAddress);
		Address workAddress = new Address("CVRGU", "BBSR", "752054");

	customer.setWorkAddress(workAddress);   //we call set method as workAddress is not included in constructor
		
		System.out.println(customer);
	}

}
