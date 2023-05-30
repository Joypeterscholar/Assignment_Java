package Snacks3;//package Snacks3;
//
//import java.util.Scanner;
//
//public class CreditCard {
//    public class CreditCardValidator {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter a credit card number: ");
//            String cardNumber = scanner.nextLine();
//            scanner.close();
//
//            boolean isValid = validateCreditCard(cardNumber);
//            if (isValid) {
//                String cardType = getCardType(cardNumber);
//                System.out.println("Card type: " + cardType);
//                System.out.println("Validity: Valid");
//            } else {
//                System.out.println("Card type: Unknown");
//                System.out.println("Validity: Invalid");
//            }
//        }
//
//        public static boolean validateCreditCard(String cardNumber) {
//            // Remove any whitespace and non-digit characters
//            cardNumber = cardNumber.replaceAll("\\s+", "");
//            if (!cardNumber.matches("\\d{13,16}")) {
//                return false;
//            }
//
//            int sum = 0;
//            boolean doubleDigits = false;
//
//            for (int i = cardNumber.length() - 1; i >= 0; i--) {
//                int digit = cardNumber.charAt(i) - '0';
//
//                if (doubleDigits) {
//                    digit *= 2;
//                    if (digit > 9) {
//                        digit = digit % 10 + digit / 10;
//                    }
//                }
//
//                sum += digit;
//                doubleDigits = !doubleDigits;
//            }
//
//            return sum % 10 == 0;
//        }
//
//        public static String getCardType(String cardNumber) {
//            if (cardNumber.startsWith("4")) {
//                return "Visa";
//            } else if (cardNumber.startsWith("5")) {
//                return "MasterCard";
//            } else if (cardNumber.startsWith("37")) {
//                return "American Express";
//            } else if (cardNumber.startsWith("6")) {
//                return "Discover";
//            } else {
//                return "Unknown";
//            }
//        }
//    }
//}

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a credit card number: ");
        String cardNumber = scanner.nextLine();
        scanner.close();

        boolean isValid = validateCreditCard(cardNumber);
        if (isValid) {
            String cardType = getCardType(cardNumber);
            System.out.println("Card type: " + cardType);
            System.out.println("Validity: Valid");
        } else {
            System.out.println("Card type: Unknown");
            System.out.println("Validity: Invalid");
        }
    }

    public static boolean validateCreditCard(String cardNumber) {
        // Remove any whitespace and non-digit characters
        cardNumber = cardNumber.replaceAll("\\s+", "");
        if (!cardNumber.matches("\\d{13,16}")) {
            return false;
        }

        int sum = 0;
        boolean doubleDigits = false;

        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int digit = cardNumber.charAt(i) - '0';

            if (doubleDigits) {
                digit *= 2;
                if (digit > 9) {
                    digit = digit % 10 + digit / 10;
                }
            }

            sum += digit;
            doubleDigits = !doubleDigits;
        }

        return sum % 10 == 0;
    }

    public static String getCardType(String cardNumber) {
        if (cardNumber.startsWith("4")) {
            return "Visa";
        } else if (cardNumber.startsWith("5")) {
            return "MasterCard";
        } else if (cardNumber.startsWith("37")) {
            return "American Express";
        } else if (cardNumber.startsWith("6")) {
            return "Discover";
        } else {
            return "Unknown";
        }
    }
}
