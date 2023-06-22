import java.util.Scanner;


public class RunwayLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the acceleration, a");
		double a = input.nextDouble();
		System.out.println("Enter the speed, v");
		double v = input.nextDouble();
		
		double length = ((v * v) / (2 * a));
		System.out.println("The minimum runway length for this airplane is " + length);
	}

}

