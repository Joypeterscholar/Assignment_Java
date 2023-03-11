import java.util.Scanner;

public class Health {

	public static void main (String [] args) {
	
	Scanner healthInput = new Scanner (System.in);
	
	System.out.println ("Enter weight in pounds: ");
	
	double weight = healthInput.nextDouble();
	
	System.out.println ("Enter height in inches: ");
	
	double height = healthInput.nextDouble();
	
	double weightKilogram = 0.45359237 * weight;
	
	double heightMeters = 0.0254 * height;
	
	double heightSquare = heightMeters * heightMeters;
	
	double bmi = weightKilogram / heightSquare;
	
	System.out.println("BMI IS " + bmi);
	
	
	}


}
