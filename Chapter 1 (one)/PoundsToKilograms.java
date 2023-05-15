import java.util.Scanner;


public class PoundsToKilograms {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		double convert = pounds * 0.454;
		System.out.println("The value in Kilograms is " + convert);
	}
}

