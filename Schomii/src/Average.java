import java.util.Scanner;

public class Average {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int sum = 0;
            int counter = 0;
            int average = 0;
            while (counter < 5) {
                System.out.println("enter a score");
                int x = input.nextInt();
                if (x > -1 && x < 101) {
                    sum = sum + x;
                    counter++;
                    average = sum/counter;
                }

            }
            System.out.println("the sum is " + sum);
            System.out.println("the average is " + average);

        }
    }

