package Snacks3;

import java.util.Scanner;

public class Credit2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number: ");
        String[] cardNumber = new String[]{input.nextLine()};
        input.close();
        if (cardNumber.length < 13 && cardNumber.length > 16) {
            throw new IndexOutOfBoundsException("invalid card number");
        }
            if (cardNumber[0].startsWith("4")) {
                System.out.println("Visa");
            } else if (cardNumber[0].startsWith("5")) {
                System.out.println("MasterCard");
            } else if (cardNumber[0].startsWith("37")) {
                System.out.println("American Express");
            } else if (cardNumber[0].startsWith("6")) {
                System.out.println("Discover");
            } else
                System.out.println("Incorrect credit card number");
            int sum = 0;
            boolean doubleDigits = false;
            for (int i = cardNumber.length - 2; i >= 0; i -= 2) {
                int digit = Integer.parseInt(cardNumber[i]) * 2;
                if (digit > 9) {
                    digit = digit % 10 + digit / 10;

                    cardNumber[i] = String.valueOf(digit);
                }
                sum += digit;
                doubleDigits = !doubleDigits;
            }
            if (sum % 10 == 0) {
                System.out.println("The card number is valid");
            } else
                System.out.println("The card number is invalid");

        }


    }


