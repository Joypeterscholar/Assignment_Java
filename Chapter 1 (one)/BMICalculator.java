import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weight in pounds: ");
		double weight = input.nextDouble();
		double weightInKilogram = weight * 0.45359237;
		System.out.println("Enter your height in inches: ");
		double height = input.nextDouble();
		double heightInMetres = height * 0.0254;
		double bmi = weightInKilogram / (heightInMetres * heightInMetres);
		System.out.println("Your BMI is " + bmi);
	}
}

