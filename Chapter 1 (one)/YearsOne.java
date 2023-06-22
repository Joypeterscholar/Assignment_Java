import java.util.Scanner;

public class Years {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of minutes: ");
	long minutes = input.nextLong();

	long year = minutes / (60 * 24 * 365);
	long day = minutes % (60 * 24 * 365) / (60 * 24);

	System.out.printf("%d minutes is approximately %d years and %d days", minutes, year, day);


		}


}