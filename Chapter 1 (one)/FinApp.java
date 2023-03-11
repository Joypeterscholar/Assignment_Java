import java.util.Scanner;

public class FinApp {

	public static void main (String [] args) {
	
		Scanner inputFin = new Scanner(System.in);
		
		System.out.println ("Enter investment amount:");
		
		double investmentAmount = inputFin.nextDouble();
		
		System.out.println ("Enter annual interest rate in percentage:");
		
		double intRate = inputFin.nextDouble();
		
		System.out.println ("Enter number of years:");
		
		int numberOfYears = inputFin.nextInt();
		
		double intfun = numberOfYears * 12;
		
		double accValue =  (1 + (intRate/100)/12 );
		
		double finalValue = Math.pow(accValue, intfun);
		
		double totalValue = investmentAmount * finalValue;
		
		System.out.println ("Accummulated Value is $" + totalValue);
		
		
		
		
	
	
	}


}
