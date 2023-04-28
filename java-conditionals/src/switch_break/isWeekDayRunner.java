package switch_break;
public class isWeekDayRunner {

	public static void main(String[] args) {
System.out.println(isWeekDay(2));		
	}

public static boolean isWeekDay(int dayNumber) {
	switch(dayNumber) {
	case 1 : 
	case 2 :
	case 3 : 
	case 4 : 
	case 5 : return true;

	}
	return false;
}
}
//when using return type, no need to use break. It will return only one value