import java.util.Scanner;

public class Arithmetic {

	public static void main (String [] args) {
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.println ("Enter first number");
	
	int firstNumber = userInput.nextInt();
	
	System.out.println ("Enter second number");
	
	int secondNumber = userInput.nextInt();
	
	int sum = firstNumber + secondNumber;
	
	System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum);
	
	
	}






}
