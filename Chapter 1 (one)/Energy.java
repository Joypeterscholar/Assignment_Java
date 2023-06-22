import java.util.Scanner;

public class Energy {

	public static void main (String [] args) {
	
		Scanner inputEnergy = new Scanner (System.in);
		
		System.out.println("Enter the amount of water in kilograms: ");
		
		double waterAmount = inputEnergy.nextDouble();
		
		System.out.println ("Enter the initial temperature: ");
		
		double initialTemperature = inputEnergy.nextDouble();
		
		System.out.println ("Enter the final temperature ");
		
		double finalTemperature = inputEnergy.nextDouble();
		
		double energySum = waterAmount * (finalTemperature - initialTemperature) * 4184;
		
		System.out.println("The energy needed is " + energySum);
	
	
	
	}









}
