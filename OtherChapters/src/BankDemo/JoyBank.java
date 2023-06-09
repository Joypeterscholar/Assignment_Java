package BankDemo;

import java.util.ArrayList;
import java.util.List;

public class JoyBank {

    public  List<JoyAccount> accounts = new ArrayList<>();

    public String registerNewCustomer(String firstName, String lastName, int age, String address, String bvn, String pin) {
        if (firstName.equals("")) {
            throw new IllegalArgumentException("Enter valid first name!");
        }
        if (lastName.equals("")) {
            throw new IllegalArgumentException("Enter valid last name!");
        }
        if (age <= 0) {
            throw new IllegalArgumentException("Enter valid age!");
        }
        if (address.equals("")) {
            throw new IllegalArgumentException("Enter valid address!");
        }
        if (bvn.equals("")) {
            throw new IllegalArgumentException("Enter valid bvn!");
        }
        if (pin.equals("")) {
            throw new IllegalArgumentException("Enter valid pin!");
        }
        if (bvn.length() != 10) {
            throw new IllegalArgumentException("Bvn must be 10 digits!");
        }
        if (pin.length() != 4) {
            throw new IllegalArgumentException("Pin must be 4 digits!");
        }
        JoyAccount account = new JoyAccount(firstName, lastName, age, address, bvn, pin);
        accounts.add(account);
        return "SUCCESSFULLY CREATED ACCOUNT\n" + "Account Number is: " + account.getAccountNumber();
    }

    public String deposit(String accountNumber, int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Enter a valid amount");
        }
        for (JoyAccount account: accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
                return "SUCCESSFUL";
            }
        }
        throw new NullPointerException("Account Not Found");
    }

    public void withdraw(String accountNumber, String pin, int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Enter a valid amount");
        }
        for (JoyAccount account: accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                if (!account.validatePin(pin)) {
                    throw new IllegalArgumentException("Incorrect Pin!");
                }
                if (account.checkBalance() < amount) {
                    throw new ArithmeticException("You have insufficient funds!");
                }
                account.withdraw(amount);
                return;
            }
        }
        throw new NullPointerException("Account Not Found");
    }

    public void transfer(String accountNumberOfSender, String accountNumberOfReceiver, String pin, int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Enter a valid amount");
        }
        for (JoyAccount account: accounts) {
            if (account.getAccountNumber().equals(accountNumberOfSender)) {
                if (!account.validatePin(pin)) {
                    throw new IllegalArgumentException("Incorrect Pin!");
                }
                if (amount <= account.checkBalance()) {
                    account.withdraw(amount);
                }
                else {
                    throw new ArithmeticException("Insufficient funds!");
                }

                for (JoyAccount accountToReceive: accounts) {
                    if (accountToReceive.getAccountNumber().equals(accountNumberOfReceiver)) {
                        accountToReceive.deposit(amount);
                        return;
                    }
                }
            }
        }
    }

    public JoyAccount findBankAccount(String accountNumber) {
        for (JoyAccount account: accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new RuntimeException("Account not found!");
    }

    public boolean checkIfAccountExists(String accountNumber) {
        for (JoyAccount account: accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return false;
            }
        }
        return true;
    }

    public String checkAccountBalance(String accountNumber, String pin) {
        for (JoyAccount account: accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                if (!account.validatePin(pin)) throw new RuntimeException("Invalid pin entered.");
                return "Hi, " + account.getFirstName() + " " + account.getLastName() + "\n" + "Your balance is: " + account.checkBalance();
            }
        }
        throw new RuntimeException("Account not found!");
    }

    public boolean validateUserCredentials(String accountNumber, String pin) {
        for (JoyAccount account: accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account.validatePin(pin);
            }
        }
        return false;
    }
}
