import java.util.Scanner;

public class Years {

	public static void main (String [] args) {
	
		Scanner inputYears = new Scanner(System.in);
		
		System.out.println ("Enter the number of minutes: ");
		
		long minutesValue = inputYears.nextLong();
		
		long yearsValue =  minutesValue / (60 * 24 * 365);
		
	
		long daysValue =  minutesValue % (60 * 24 * 365);
		
		long finalDaysValue = daysValue / (60 * 24);
		
		System.out.println(minutesValue + " minutes is approximately " + yearsValue + " years and " + finalDaysValue + " days");
		
	
	
	
	}





}
