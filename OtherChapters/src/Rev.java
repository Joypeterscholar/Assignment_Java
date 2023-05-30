import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        int b = 1;
        System.out.println("enter a 5 digit number");
        int num = input.nextInt();
        int nums;
        while (x < 6) {
            nums = num / b % 10;
            b = b * 10;
            x++;
            System.out.print(nums);

        }
    }
}
