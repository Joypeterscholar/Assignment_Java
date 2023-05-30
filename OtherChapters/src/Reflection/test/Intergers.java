package Reflection.test;

import java.util.Scanner;

public class Intergers {
    public static int square(int num) {
        return num * num;
    }
    public static int sumOfSquares(int num1, int num2) {
        return square(num1) + square(num2);
    }

    public static int subtractOfSquares(int num1, int num2) {
        return square(num1) - square(num2);
    }

    public static void main(String[] args)  {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter first integer: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter second integer: ");
            int num2 = scanner.nextInt();

            int square1 = square(num1);
            int square2 = square(num2);
            int sum = sumOfSquares(num1, num2);
            int subtract = subtractOfSquares(num1, num2);

            System.out.println("The square of the first integer is: " + square1);
            System.out.println("The square of the second integer is: " + square2);
            System.out.println("The sum of their squares is: " + sum);
            System.out.println("The difference of their squares is: " + subtract);
        }

    }
