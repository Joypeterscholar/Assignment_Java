import java.util.Scanner;

public class Exercise15 {

	public static void main (String [] args) {
	
	Scanner inputExc = new Scanner (System.in);
	
	System.out.println ("Enter two integers");
	
	int firstInt = inputExc.nextInt();
	
	int secondInt = inputExc.nextInt();
	
	double sqrFirstInt = Math.sqrt (firstInt);
	
	double sqrSecondInt = Math.sqrt (secondInt);
	
	System.out.println (sqrFirstInt);
	
	System.out.println (sqrSecondInt);
	
	System.out.println (sqrFirstInt + sqrSecondInt);
	
	System.out.println (sqrFirstInt - sqrSecondInt);
	
	
	
	
	
	}



}
