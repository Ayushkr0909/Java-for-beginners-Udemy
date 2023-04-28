package ifelse;
public class IfStatementRunner {

	public static void main(String[] args) {
int i = 24, j = 25;
if(i==24) {
    System.out.println("i is 25");
}
//if(j==25)
else if(j == 25) 
	{
	System.out.println("i is 24");
}
else {
	System.out.println("i is not 24 or 25");
}
}
}

/*for nested if, all the ifs are checked even the first one is true
 *for if-else-if, the first if is true, it doesn't proceed
*/