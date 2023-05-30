import java.util.Scanner;
public class Exercise17 {

	public static void main (String [] args) {
	
	Scanner input = new Scanner (System.in);
	
	System.out.println ("Enter three integers below");	
	
	int firstInt = input.nextInt();
	
	int secondInt = input.nextInt();
	
	int thirdInt = input.nextInt();
	
	int theSum = firstInt + secondInt + thirdInt;
	
	System.out.println("The sum of all the integers is " + theSum);
	
	int theAverage = theSum/3;
	
	System.out.println ("The average of the integers is " + theAverage);
	
	int theProduct = firstInt * secondInt * thirdInt;
	
	
	System.out.println("The product of all the integers is " + theProduct);
	
	
	
	if (firstInt < secondInt && firstInt < thirdInt) 
	{System.out.println("The smallest number is " + firstInt);}
	
	else if (secondInt < firstInt && secondInt < thirdInt)
	
	{System.out.println("The smallest number is " + secondInt);}
	
	else if (thirdInt < firstInt && thirdInt < secondInt)
	
	{System.out.println("The smallest number is " + thirdInt);}
	
	else {
	System.out.println("Two or three numbers are equal");
	}
	
	
	if (firstInt > secondInt && firstInt > thirdInt) 
	{System.out.println("The largest number is " + firstInt);}
	
	else if (secondInt > firstInt && secondInt > thirdInt)
	
	{System.out.println("The largest number is " + secondInt);}
	
	else if (thirdInt > firstInt && thirdInt > secondInt)
	
	{System.out.println("The largest number is " + thirdInt);}
	
	else {
	System.out.println("Two or three numbers are equal");
	}
	
	
	
	
	
	
	}








}
