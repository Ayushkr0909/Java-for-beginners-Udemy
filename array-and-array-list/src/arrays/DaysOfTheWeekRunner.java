package arrays;

public class DaysOfTheWeekRunner {

	public static void main(String[] args) {
		String[] daysOfTheWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		String dayWithMostCharacters = "";
		for(String day:daysOfTheWeek) {
			if(day.length() > dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;
			}
		}
		System.out.println("The day with most Characters is " + dayWithMostCharacters);
		
	   for(int index = daysOfTheWeek.length - 1 ;index >= 0 ;index--) {
		   System.out.println(daysOfTheWeek[index]);
	   }
	}

	}

