import java.util.Scanner;

public class Distance {

	public static void main (String [] args) {
	
	Scanner inputDistance = new Scanner(System.in);
	
	System.out.println ("Enter the driving distance: ");
	
	double drivingDistanceInput = inputDistance.nextDouble();
	
	System.out.println ("Enter the miles per gallon: ");
	
	double mileGallonInput = inputDistance.nextDouble();
	
	System.out.println ("Enter price per gallon: ");
	
	double priceGallonInput = inputDistance.nextDouble();
	
	
	double costOfDriving = drivingDistanceInput / mileGallonInput * priceGallonInput;
	
	System.out.println ("The cost of driving is $" + costOfDriving);
	
	
	
	
	}





}
