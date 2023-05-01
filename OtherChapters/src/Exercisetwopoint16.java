import java.util.Scanner;

public class Exercisetwopoint16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter an integer");
        int x = input .nextInt();
     double y =   Math.pow(x, 2);
        System.out.println("the square of x is " +y);
if ((x>100) && (y>100)){
    System.out.println("x and its square is greater than 100");
}
else if ((x==100) && (y==100)) {
    System.out.println("x and its square is equal to 100");
} else if ((x!=100) && (y!=100)) {
    System.out.println("x and its square is not equal to 100");
} else if ((x<100) && (y<100)) {
    System.out.println("x and its square is less than 100");
}
else
    System.out.println("enter a valid number");
    }
    }

