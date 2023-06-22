import java.util.Scanner;
public class Separate{
	public static void main(String[] args){
		System.out.println("Enterb 4 digits separated by space");
		Scanner inputUser = new Scanner(System.in);
		int variable1 = inputUser.nextInt();
		int variable2 = inputUser.nextInt();
		int variable3 = inputUser.nextInt();
		int variable4 = inputUser.nextInt();
		System.out.print(variable1);
		System.out.print(" ");
		System.out.print(variable2);
		System.out.print(" ");
		System.out.print(variable3);
		System.out.print(" ");
		System.out.print(variable4);
		System.out.printf("%n");
	}
}
