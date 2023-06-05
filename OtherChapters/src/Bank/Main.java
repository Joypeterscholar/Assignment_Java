package Bank;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Scanner;

import static Bank.Bank.accounts;
import static Bank.Bank.findAccountByFname;


public class Main {
        private Scanner keyboardInput = new Scanner(System.in);
        private static Account account;

        public static void main(String[] args) {
            displayMainMenu();
        }

        public static void displayMainMenu() {
            String mainMenu = """
                Welcome to our Bank
                1-> Create Account
                2--> Find Account By FirstName
                3-> Others
                4-> Exit
                """;
            String userInput = input(mainMenu);
            switch (userInput.charAt(0)) {
                case '1'-> registerNewCustomer();
                case '2'-> Bank.findAccountByFname(account.fname);
                case '3'-> others();
                case '4'-> exit();
                default -> displayMainMenu();

            }
        }




        private static void exit() {
            display("thanks for using our application");
        }

        private static void deposit() {
            String accountNumber = input("enter accountNumber");
            String pin = input("enter pin");
            account = new Account(accountNumber, pin);
            display("deposited successfully");
            displayMainMenu();
        }

        private static void others() {
            String menuItem = """
                1 -> Deposit
                2 -> Withdrawal
                3 -> Transfer
                4 -> check balance
                5 -> exit
                                
                """;
            char userResponse = input(menuItem).charAt(0);
            switch (userResponse) {
                case '1' -> deposit();
                case '2' -> withdraw(account.accountNumber, account.balance, account.getPin());
                case '3' -> transfer(account.getBalance(), account, account.balance, account.getPin());
                case '4' -> {
                    int i = checkBalance("pin");
                }
                case '5' -> exit();
                default -> displayMainMenu();
            }
        }
        public static int withdraw(String accountNumber, int balance, String pin){
            for (Account account : accounts) {
                if (account.accountNumber.equals(accountNumber) && account.getPin().equals(pin) ){
                    accountNumber = input("enter accountNumber");
                    balance = Integer.parseInt(input("how much do you want to withdraw"));
                    pin = account.setPin(input("enter pin"));
                    display("transaction successful");
                    return account.balance -= balance;
                }
            }
            return 0;
        }
    public static int transfer(int sender, Account reciever, int balance, String pin) {
        for (Account account : accounts) {
            if (account.getPin().equals(pin)){
                sender = Integer.parseInt(input("enter the recievers account number"));
                balance = Integer.parseInt(input("enter balance"));
                sender -= balance;
                return reciever.balance += balance ;
            }
        }
        return 0;
    }
    public static int checkBalance(String pin) {
            pin = account.setPin(input("enter pin"));
        if (pin.equals(pin)) {
            return account.balance;
        } else {
            throw new IllegalArgumentException("Invalid PIN");
        }

    }
        private static void addAccount() {

            String title = input("enter a title");
            String body = input("enter a body");
            accounts.add(findAccountByFname(account.fname));
            display("account added successfully");

        }


        private static void viewGist() {
            String id = input("enter first name");
            Account account1 = Bank.findAccountByFname(account.fname);
            display(account1.toString());
            others();
        }

        private static void registerNewCustomer() {
            String fname = input("enter a first name");
            String lname = input("enter last name");
            int age = Integer.parseInt(input("enter age"));
            String address = input("enter an address");
            String bvn = input("enter bvn");
           Account account = new Account(fname, lname, age, address, bvn, LocalDateTime.ofEpochSecond(7, 8, ZoneOffset.ofHours(9)));
            display("Account created sucessfully ");

        }

        private static void display(String message) {
            JOptionPane.showMessageDialog(null, message);
            //    System.out.println(message);
        }

        public static String input(String prompt) {
            return JOptionPane.showInputDialog(prompt);
//        display(prompt);
//        return keyboardInput.nextLine();
        }
    }
