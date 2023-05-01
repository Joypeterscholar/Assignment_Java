import java.util.Scanner;
public class Scores {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        int counter = 1;
        while (counter <= 5) {
            System.out.println("enter a score");
           int x = input.nextInt();
            sum = sum + x;
            counter++;
        }
        System.out.println("the total sum is " + sum);

    }
}

