import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("guess the password");
        String password = "let me in";
        String guess = input.nextLine();
        while (!guess.equals(password))
        {
            System.out.println("guess the password");
            guess = input.nextLine();
        }
        System.out.println("congrats");
    }
}