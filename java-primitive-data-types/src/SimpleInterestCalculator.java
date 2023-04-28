import java.math.BigDecimal;

public class SimpleInterestCalculator {
	
BigDecimal principal;
BigDecimal interest;	

public SimpleInterestCalculator(String principal, String interest) {
	// TODO Auto-generated constructor stub
	this.principal = new BigDecimal(principal);  //converting string values to BigDecimal
	this.interest = new BigDecimal(interest);
}

public BigDecimal calculateTotalValue(int years) {
	// Total Value = principal + principal * interest * years

	return principal.add(principal.multiply(interest).multiply(new BigDecimal(years)));
}

}
