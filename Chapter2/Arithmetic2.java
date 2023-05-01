2.15	
	import java.util.Scanner;
	public class Arithmetic2{
		public static void main(String[] args){
			Scanner userInput = new Scanner(system.in);
			System.out.print(“Enter two integers: ”);
			int firstInt = userInput.nextInt();
			int secondInt = userInput.nextInt();
			int square1 = firstInt * firstInt;
			int square2 = secondInt * secondInt;
			System.out.printf("Here is the square of the first integer: %d",  square1);
			System.out.printf("Here is the square root of the second integre: %d", square2);
			int sumBothSquares = square1 + square2;
			System.out.printf("Here is the sum of both squares: %d", sumBothSquares);
			int diffBothSquares = square1 – square2;
			System.out.printf("Here is the difference between both squares: %d", diffBothsquares);
		}
	}

