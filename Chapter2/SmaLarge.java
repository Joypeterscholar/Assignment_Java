import java.util.Scanner;
public class SmaLarge{
	public static void main(String[] args){
		Scanner userInput = new Scanner;
		System.out.print(“Kindly input 3 Integers: “);
		int first = userInput.nextInt();
		int second = userInput.nextInt();
		int third = userInput.nextInt();
		int sumIt = first + second + third;
		System.out.printf(“The sum of the 3 integres is: %d”, sumIt);
		int produkt = first * second * third;
		System.out.printf(“The product of the three integers are: %d”, produkt);
		int avrage = (first + second + third) / 3;
		System.out.printf(“The avaerage of the interges entered is: %.0d”, avrage);
	}
	if((first > second) && (first > third)){
		System.out.println(“The First integer entered is the largest number”);
	}
	else{
		System.out.println(“The First integer entered isn’t the largest number”);
	}
	if((second > third) && (second > first)){
		System.out.println(“The second integer entered is the largest number”);
	else{
		System.out.println(“The second integer entered isn’t the largest number”);
	}
	if((third > first) && (third > second)){
		System.out.println(“The third integer entered is the largest number”);
	}
	else{
		System.out.println(“The third integer entered isn’t the largest number”);
	}
		
	if((first < second) && (first < third)){
		System.out.println(“The First integer entered is the smallest number”);
	}
	else{
		System.out.println(“The First integer entered isn’t the smallest number”);
	}
	if((second < third) && (second < first)){
		System.out.println(“The second integer entered is the smallest number”);
	else{
		System.out.println(“The second integer entered isn’t the smallest number”);
	}
	if((third < first) && (third < second)){
		System.out.println(“The third integer entered is the smallest number”);
	}
	else{
		System.out.println(“The third integer entered isn’t the smallest number”);
	}
}
