import java.util.Scanner;

public class ReadInt2 {
    public static void main(String[] args) {
        int y;
        int z;
        int a;
        int b;
        int c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number with five digits");
        int x = input.nextInt();
        y = x % 10;
        a = x / 10 % 10;
        b = x / 100 % 10;
        c = x / 1000% 10;
        z = x / 10000 % 10;
        System.out.println(+y + "," + a + "," + b + "," + c + "," + z);
        }
    }

