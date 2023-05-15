import java.util.Scanner;


public class EvenOdd {

	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		int a = input.nextInt();
		int b = input.nextInt();

		int oddSum = 0;
		int evenSum = 0;
		
		if (x % 2 == 0) {
			evenSum = evenSum + x;
		}
		else {
			oddSum = oddSum + x;
		}
		
		if (y % 2 == 0) {
			evenSum = evenSum + y;
		}
		else {
			oddSum = oddSum + y;
		}
		
		if (z % 2 == 0) {
			evenSum = evenSum + z;
		}
		else {
			oddSum = oddSum + z;
		}
		
		if (a % 2 == 0) {
			evenSum = evenSum + a;
		}
		else {
			oddSum = oddSum + a;
		}
		
		if (b % 2 == 0) {
			evenSum = evenSum + b;
		}
		else {
			oddSum = oddSum + b;
		}
	}

}



