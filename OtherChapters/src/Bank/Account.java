package Bank;

import java.time.LocalDateTime;

public class Account {
    String fname;
    private String lname;
    private int age;
    String accountNumber;
    private String address;
    private String bvn;
    private LocalDateTime dateTime = LocalDateTime.now();
    int balance;
    private String amount;
    private String pin;
    Account sender;
    Account reciever;

    public Account(String fname, String lname, int age, String address, String bvn, LocalDateTime dateTime) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.address = address;
        this.bvn = bvn;
        this.dateTime = dateTime;
    }

    public Account(String accountNumber, String pin) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = 0;
    }

    public Account(String fname, String lname, int age, String address, String bvn, LocalDateTime dateTime, String accountNumber) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.address = address;
        this.bvn = bvn;
        this.dateTime = dateTime;
        this.accountNumber = accountNumber;
    }


    public String setPin(String pin) {
        this.pin = pin;
        return this.pin;
    }

    public String getPin() {
        return pin;
    }

    public void setFname() {
        this.fname = fname;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (pin.equals(this.pin))
            balance = balance + amount;
        else throw new IllegalArgumentException("Invalid PIN");
    }

    public void withdraw(String pin, int amount) {
        this.pin = pin;
        if (pin.equals(this.pin))
            balance = balance - amount;
        else throw new IllegalArgumentException("Invalid PIN");


    }

    public int checkBalance(String pin) {
        if (pin.equals(this.pin)) {
            return balance;
        } else {
            throw new IllegalArgumentException("Invalid PIN");
        }

    }

    public String getFname() {
        return fname;
    }
    public void setAccountNumber(){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}

