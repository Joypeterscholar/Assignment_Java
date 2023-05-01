import java.util.Scanner;
public class Pyramid{
	public static void main(String[] args){
		System.out.println("Enter the Estimated number of stones used");
		Scanner userInput = new Scanner(System.in);
		double noOfStone = userInput.nextDouble();
		System.out.println("Enter the average weight of each stone");
		double avWOfStone = userInput.nextDouble();
		System.out.println("Enter the no of years taken");
		double noOfYears = userInput.nextDouble();
		
		double noOfStonesYr = (noOfStone * 15) / noOfYears;
		double noOfStonesHr = noOfStonesYr / (24 * 365);
		double noOfStonesMin = noOfStonesHr / (60 * 24);
		System.out.printf("The number of pyramid stones that was built per year is: %.2f%n", noOfStonesYr);
		System.out.printf("The number of pyramid stones that was built per hour is : %.2f%n", noOfStonesHr);
		System.out.printf("The number of pyramid stones that was built per minute is: %.2f%n", noOfStonesMin);
	}
}
