import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int y = 1;
        int counter;

        System.out.println("Enter a number");
        int num = input.nextInt();
        for (counter = 1; counter <= num; counter++) {
            y *= counter;
        }
        System.out.println("the factorial is " + y);
    }
}
