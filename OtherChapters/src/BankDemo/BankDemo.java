package BankDemo;

import javax.swing.*;

public class BankDemo {

    private static final JoyBank bank = new JoyBank();

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        String mainMenu = """
            Welcome to our Bank
            1-> Create Account
            2--> Find Account
            3-> Others
            4-> Exit
            """;
        String userInput = input(mainMenu);
        int choice = 0;
        try {
            choice = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            display("Enter a valid number!");
            displayMainMenu();
        }

        switch (choice) {
            case 1 -> registerNewCustomer();
            case 2 -> findAccount();
            case 3 -> others();
            case 4 -> exit();
            default -> displayMainMenu();
        }
    }

    private static void registerNewCustomer() {
        String fName = input("enter a first name");
        String lName = input("enter last name");
        int age = 0;
        try {
            age = Integer.parseInt(input("enter age"));
            if (age == 0) throw new NumberFormatException();
        }
        catch (NumberFormatException numberFormatException) {
            display("Invalid age entered. Starting customer creation again");
            registerNewCustomer();
        }
        String address = input("enter an address");
        String bvn = input("enter bvn");
        try {
            Integer.parseInt(bvn);
        }
        catch (NumberFormatException numberFormatException) {
            display("Invalid bvn entered. Please enter only numbers. Starting customer creation again");
            registerNewCustomer();
        }
        String pin = input("Enter your pin");
        try {
            Integer.parseInt(pin);
        }
        catch (NumberFormatException numberFormatException) {
            display("Invalid pin entered. Please enter only numbers. Starting customer creation again");
            registerNewCustomer();
        }
        try {
            display(bank.registerNewCustomer(fName, lName, age, address, bvn, pin));
            displayMainMenu();
        }
        catch (IllegalArgumentException exception) {
            display(exception.getMessage());
            registerNewCustomer();
        }
    }

    public static void findAccount() {
        String accountNumber = input("enter account number");
        try {
            Integer.parseInt(accountNumber);
        }
        catch (NumberFormatException numberFormatException) {
            display("Invalid account number entered. Please enter only numbers. Returning....");
            displayMainMenu();
        }
        JoyAccount account;
        try {
            account = bank.findBankAccount(accountNumber);
            display(account.toString());
            displayMainMenu();
        }
        catch (RuntimeException exception) {
            display(exception.getMessage());
            displayMainMenu();
        }
    }

    private static void others() {
        String menuItem = """
            1 -> Deposit
            2 -> Withdrawal
            3 -> Transfer
            4 -> check balance
            5 -> Back

            """;
        String userInput = input(menuItem);
        int userResponse = 0;
        try {
            userResponse = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            display("Enter a valid number!");
            displayMainMenu();
        }
        switch (userResponse) {
            case 1 -> deposit();
            case 2 -> withdraw();
            case 3 -> transfer();
            case 4 -> checkBalance();
            default -> displayMainMenu();
        }
    }

    private static void deposit() {
        String accountNumber = input("enter accountNumber");
        try {
            Integer.parseInt(accountNumber);
        }
        catch (NumberFormatException numberFormatException) {
            display("Invalid account number entered. Please enter only numbers. Returning....");
            others();
        }
        if (bank.checkIfAccountExists(accountNumber)) {
            display("Account does not exist or account not found!");
            others();
        }
        try {
            int amount = Integer.parseInt(input("enter amount"));
            if (amount <= 0) {
                display("Please enter a valid amount");
                others();
            }
            bank.deposit(accountNumber, amount);
            display("deposited successfully");
            others();
        }
        catch (NumberFormatException exception) {
            display("Please enter a valid WHOLE NUMBER");
            others();
        }
    }

    public static void withdraw(){
        String accountNumber = input("enter account number");
        try {
            Integer.parseInt(accountNumber);
        }
        catch (NumberFormatException numberFormatException) {
            display("Invalid account number entered. Please enter only numbers. Returning....");
            others();
        }
        if (bank.checkIfAccountExists(accountNumber)) {
            display("Account does not exist or account not found!");
            others();
        }
        String pin = input("enter pin");
        try {
            Integer.parseInt(pin);
        }
        catch (NumberFormatException numberFormatException) {
            display("Invalid pin entered. Please enter only numbers. Starting check balance again");
            others();
        }
        try {
            int amount = Integer.parseInt(input("enter amount"));
            bank.withdraw(accountNumber, pin, amount);
            display("Take your money");
            others();
        }
        catch (NumberFormatException exception) {
            display("Please enter a valid WHOLE NUMBER");
            others();
        }
        catch (ArithmeticException arithmeticException) {
            display(arithmeticException.getMessage());
            others();
        }
    }

    public static void transfer() {
        String accountNumberOfSender = input("enter accountNumber of sender");
        String pin = validateAccountNumber(accountNumberOfSender);
        try {
            Integer.parseInt(pin);
            if (!bank.validateUserCredentials(accountNumberOfSender, pin)) throw new RuntimeException();
        }
        catch (NumberFormatException numberFormatException) {
            display("Invalid pin entered. Please enter only numbers. Starting check balance again");
            transfer();
        }
        catch (RuntimeException runtime) {
            display("Incorrect pin entered");
            transfer();
        }
        String accountNumberOfReceiver = input("enter accountNumber of receiver");
        try {
            Integer.parseInt(accountNumberOfReceiver);
        }
        catch (NumberFormatException numberFormatException) {
            display("Invalid account number entered. Please enter only numbers. Returning....");
            others();
        }
        if (bank.checkIfAccountExists(accountNumberOfSender)) {
            display("Account does not exist or account not found!");
            displayMainMenu();
        }
        try {
            int amount = Integer.parseInt(input("enter amount"));
            bank.transfer(accountNumberOfSender, accountNumberOfReceiver, pin, amount);
            display("Transfer successful");
            others();
        }
        catch (NumberFormatException exception) {
            display("Please enter a valid WHOLE NUMBER");
            others();
        }
        catch (ArithmeticException | IllegalArgumentException arithmeticException) {
            display(arithmeticException.getMessage());
            others();
        }
    }

    private static String validateAccountNumber(String accountNumberOfSender) {
        try {
            Integer.parseInt(accountNumberOfSender);
        }
        catch (NumberFormatException numberFormatException) {
            display("Invalid account number entered. Please enter only numbers. Returning....");
            others();
        }
        if (bank.checkIfAccountExists(accountNumberOfSender)) {
            display("Account does not exist or account not found!");
            displayMainMenu();
        }
        return input("enter pin");
    }

    public static void checkBalance() {
        String accountNumber = input("enter accountNumber");
        String pin = validateAccountNumber(accountNumber);
        try {
            Integer.parseInt(pin);
        }
        catch (NumberFormatException numberFormatException) {
            display("Invalid pin entered. Please enter only numbers. Starting check balance again");
            checkBalance();
        }
        try {
            display(bank.checkAccountBalance(accountNumber, pin));
        }
        catch (RuntimeException exception) {
            display(exception.getMessage());
        }
        displayMainMenu();
    }

    private static void exit() {
        display("thanks for using our application");
        System.exit(0);
    }

    private static void display(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }
}
