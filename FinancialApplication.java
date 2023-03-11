import java.util.Scanner;

public class FinancialApplication {

	public static void main (String [] args) {
	
		Scanner inputInterest = new Scanner (System.in);
		
		System.out.println ("Enter balance and interest rate (e.g., 3 for 3%):");
		
		
		int balance = inputInterest.nextInt();
		
		double interest = inputInterest.nextDouble();
		
		double interestSum = balance * (interest / 1200);
		System.out.println("The interest is " + interestSum);
		
		
		
		
		
	}
}


