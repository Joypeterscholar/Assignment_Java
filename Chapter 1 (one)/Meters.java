import java.util.Scanner;

public class Meters {

	public static void main (String [] args) {
	
		Scanner inputMeters = new Scanner (System.in);
		
		System.out.println ("Enter a value for feet: ");
		
		double inputFeet = inputMeters.nextDouble();
		
		double convertToMeters = inputFeet * 0.305;
		
		System.out.println(inputFeet + " Feet is " + convertToMeters + " meters");
	
	}



}
