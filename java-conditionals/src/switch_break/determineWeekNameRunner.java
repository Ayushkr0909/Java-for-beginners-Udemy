package switch_break;
public class determineWeekNameRunner {

	public static void main(String[] args) {
		System.out.print(determineWeekName(5));
	}
	public static String determineWeekName(int weekNumber) {
		
		switch(weekNumber) {
		case 0 : return "Sunday";
		case 1 : return "Monday";
		case 2 : return "Tuesday";
		case 3 : return "Wednesday";
		case 4 : return "Thursday";
		case 5 : return "Friday";
		case 6 : return "Saturday";
			}
		return "Invalid week";
	}
}
