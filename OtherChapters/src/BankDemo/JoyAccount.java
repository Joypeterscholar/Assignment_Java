package BankDemo;

import java.security.SecureRandom;
import java.time.LocalDateTime;

public class JoyAccount {

    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private final String bvn;
    private String pin;
    private int balance;
    private String accountNumber;
    private final LocalDateTime createdAt;

    public JoyAccount(String firstName, String lastName, int age, String address, String bvn, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.bvn = bvn;
        this.pin = pin;
        this.balance = 0;
        this.accountNumber = JoyBank.generateAccountNumber();
        this.createdAt = LocalDateTime.now();
    }

    public JoyAccount(String firstName, String lastName, int age, String address, String bvn, String pin, int balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.bvn = bvn;
        this.pin = pin;
        this.balance = balance;
        this.accountNumber = JoyBank.generateAccountNumber();
        this.createdAt = LocalDateTime.now();
    }


    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public boolean validatePin(String enteredPin) {

        return this.pin.equals(enteredPin);
    }

    public void setPin(String pin) {

        this.pin = pin;
    }

    public int checkBalance() {

        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= checkBalance()) {
            this.balance -= amount;
        }
    }

    public String getBvn() {
        return bvn;

    }

    public String getAccountNumber() {
        return accountNumber;
    }



    @Override
    public String toString() {
        return "Account Details {" + "\n" +
                "firstName='" + firstName + "'\n" +
                ", lastName='" + lastName + "'\n" +
                ", age=" + age + "'\n" +
                ", address='" + address + "'\n" +
                ", balance=" + balance + "'\n" +
                ", accountNumber='" + accountNumber + "'\n" +
                ", createdAt=" + createdAt.getDayOfWeek().toString() + "  " + createdAt.getMonth().toString() + "  " + createdAt.getYear() + "\n" +
                '}';
    }
}
