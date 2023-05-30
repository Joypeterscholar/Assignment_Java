import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        for (int count = 1; count <= 30; count++){
            System.out.print(count);
            for (int counter = 0; counter < count; counter++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}