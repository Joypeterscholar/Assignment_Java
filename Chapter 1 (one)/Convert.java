import java.util.Scanner;

public class Convert {

	public static void main (String [] args) {
	
		Scanner convertInput = new Scanner(System.in);
		
		System.out.println ("Enter a number in pounds: ");
		
		double pound = convertInput.nextDouble();
		
		double convertToKilogram = pound * 0.454;
		
		System.out.println(pound + " pounds is " + convertToKilogram + " Kilograms");
	
	
	
	}






}
