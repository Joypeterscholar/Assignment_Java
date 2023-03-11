import java.util.Scanner; 

public class Runway {

	public static void main (String [] args) {
	
		Scanner runwayInput = new Scanner (System.in);
		
			System.out.println ("Enter speed and acceleration: ");
			
			int speed = runwayInput.nextInt();
			
			double acceleration = runwayInput.nextDouble();
			
			double v = Math.pow(speed, 2);
	
			double minRunway = v / (2 * acceleration);
			
			System.out.println ("The minimum runway lenght for this airplane is " + minRunway);
	
	}







}
