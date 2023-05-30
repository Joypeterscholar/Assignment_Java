import java.util.Scanner;

public class Exercisetwopoint17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int a = input.nextInt();
        System.out.println("enter second number");
        int b = input.nextInt();
        System.out.println("enter third number");
        int c = input.nextInt();
        int sum = a + b+ c;
        int average = sum/3;
        int product = a * b * c;
        int small = Math.min(a, Math.min(b,c));
        int big = Math.max(a, Math.max(b, c));
        System.out.println("the sum of the 3 numbers are " +sum);
        System.out.println("the average of the 3 numbers are " +average);
        System.out.println("the product of the 3 numbers are " +product);
        System.out.println("the smallest number is " +small);
        System.out.println("the biggest number is " +big);
    }
}
