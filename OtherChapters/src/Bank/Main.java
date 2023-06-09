package Bank;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Scanner;

//import static Bank.Bank.accounts;


public class Main {
//    private Scanner keyboardInput = new Scanner(System.in);
//    private static Account account;
//
//    public static void main(String[] args) {
//
//        displayMainMenu();
//    }
//
//
//        public static void displayMainMenu() {
//            String mainMenu = """
//                Welcome to our Bank
//                1-> Create Account
//                2--> Find Account By FirstName
//                3-> Others
//                4-> Exit
//                """;
//            String userInput = input(mainMenu);
//            switch (userInput.charAt(0)) {
//                case '1'-> registerNewCustomer();
//                case '2'-> findAccount();
//                case '3'-> others();
//                case '4'-> exit();
//                default -> displayMainMenu();
//
//            }
//        }
//
//
//    public static Account findAccount() {
//        String accountNumber = input("enter account number");
//        for (Account account : accounts) {
//
//            if (accountNumber != null && accountNumber.equals(account.getAccountNumber())) {
//                return account;
//            }
//            else if(!accountnumber.equals(accountnumber)){
//                throw new RuntimeException( "invalid account number");
//            }
//            displayMainMenu();
//        }
//
//        return account;
//    }
//
//
//        private static void exit() {
//            display("thanks for using our application");
//        }
//
//        private static void deposit() {
//            String accountNumber = input("enter accountNumber");
//            int amount = Integer.parseInt(input("enter amount"));
//            String pin = input("enter pin");
//            account = new Account(accountNumber, amount, pin);
//            display("deposited successfully");
//            displayMainMenu();
//        }
//
//        private static void others() {
//            String menuItem = """
//                1 -> Deposit
//                2 -> Withdrawal
//                3 -> Transfer
//                4 -> check balance
//                5 -> exit
//
//                """;
//            char userResponse = input(menuItem).charAt(0);
//            switch (userResponse) {
//                case '1' -> deposit();
//                case '2' -> withdraw(account.accountNumber, account.balance, account.getPin());
//                case '3' -> transfer(account.getBalance(), account, account.balance, account.getPin());
//                case '4' -> checkBalance("pin");
//                case '5' -> exit();
//                default -> displayMainMenu();
//            }
//        }
//        public static void withdraw(String accountNumber, int balance, String pin){
//            for (Account account : accounts) {
//                if (account.accountNumber.equals(accountNumber) && account.getPin().equals(pin) ){
//                    accountNumber = input("enter accountNumber");
//                    balance = Integer.parseInt(input("how much do you want to withdraw"));
//                    pin = account.setPin(input("enter pin"));
//                    display("transaction successful");
//                     account.balance -= balance;
//                }
//            }
//
//            displayMainMenu();
//        }
//    public static void transfer(int sender, Account reciever, int balance, String pin) {
//        for (Account account : accounts) {
//            if (account.getPin().equals(pin)){
//                sender = Integer.parseInt(input("enter the recievers account number"));
//                balance = Integer.parseInt(input("enter balance"));
//                sender  -= balance;
//                 reciever.balance += balance ;
//            }
//        }
//        displayMainMenu();
//    }
//    public static void checkBalance(String pin) {
//            pin = account.setPin(input("enter pin"));
//        if (pin.equals(pin)) {
//            int balance = account.balance;
//        } else {
//            throw new IllegalArgumentException("Invalid PIN");
//        }
//        displayMainMenu();
//    }
//        private static void addAccount() {
//
//            String title = input("enter a title");
//            String body = input("enter a body");
//            accounts.add(findAccount(account.accountNumber));
//            display("account added successfully");
//            displayMainMenu();
//        }
//
//
//        private static void viewGist() {
//            String id = input("enter first name");
//            Account account1 = Bank.findAccount(account.accountNumber);
//            display(account1.toString());
//            others();
//        }
//
//        private static void registerNewCustomer() {
//            String fname = input("enter a first name");
//            String lname = input("enter last name");
//            int age = Integer.parseInt(input("enter age"));
//            String address = input("enter an address");
//            String bvn = input("enter bvn");
//           Account account1 = new Account(fname, lname, age, address, bvn, LocalDateTime.ofEpochSecond(7, 8, ZoneOffset.ofHours(9)));
//            display("Account created sucessfully ");
//
//        }
//
//        private static void display(String message) {
//            JOptionPane.showMessageDialog(null, message);
//            //    System.out.println(message);
//        }
//
//        public static String input(String prompt) {
//            return JOptionPane.showInputDialog(prompt);
////        display(prompt);
////        return keyboardInput.nextLine();
//        }
    }
