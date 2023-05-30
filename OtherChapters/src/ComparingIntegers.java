import java.util.Scanner;

public class ComparingIntegers {



    public static double setSquare(double num) {
     return Math.pow(num,2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = input.nextInt();
        System.out.println("the square of the number is " +setSquare(x));
    }
}
