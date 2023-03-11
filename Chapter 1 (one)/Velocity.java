import java.util.Scanner;

public class Velocity {

	public static void main (String [] args) {
	
		Scanner startingVelocity = new Scanner (System.in);
		
		System.out.println ("Enter the starting velocity in meters/second v0, the ending velocity v1 in meters/second and the time span t in seconds");
		
		float v0 = startingVelocity.nextFloat();
		
		float v1 = startingVelocity.nextFloat();
		
		float t = startingVelocity.nextFloat();
		
		float averageAcceleration = (v1 - v0) / t;
		
		System.out.println ("The average acceleration is " + averageAcceleration);
	
	}




}
