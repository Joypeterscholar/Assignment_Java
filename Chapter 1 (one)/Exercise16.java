import java.util.Scanner;

public class Exercise16 {

	public static void main (String [] args) {
	
	Scanner inputInt = new Scanner (System.in);
	
	System.out.println("Enter a number here");
	
	int cimInt = inputInt.nextInt();
	
	double sqrCimInt = Math.sqrt(cimInt);
	
	double sumNum = cimInt + sqrCimInt;
	if (sumNum > 100) 
	{System.out.println("The number is greater than 100");}
	 
	 
	else if (sumNum == 100)
	{System.out.println("The number is equal to 100");}
	
	else if (sumNum != 100)
	{System.out.println("The number is not equal to 100");}
	 
	 
	else
	{System.out.println("The number is less than 100");}




	}
	




}
