import java.util.Scanner;


public class Interest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the balance");
		double balance = input.nextDouble();
		System.out.println("Enter the interest rate");
		double rate = input.nextDouble();
		
		double interest = balance * (rate / 1200);
		System.out.println("The interest is " + interest);
	}
}

