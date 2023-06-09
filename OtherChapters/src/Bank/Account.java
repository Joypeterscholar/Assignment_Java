//package Bank;
//
//import java.time.LocalDateTime;
//
//public class Account {
//    private String fname;
//    private String lname;
//    private int age;
//    private String address;
//    private String accountNumber;
//    private String bvn;
//    private LocalDateTime dateTime = LocalDateTime.now();
//    private int balance;
//    private int amount;
//    private String pin;
////    private Account sender;
////    private Account reciever;
//
////    public Account(String fname, String lname, int age, String address, String bvn, LocalDateTime dateTime) {
////        this.fname = fname;
////        this.lname = lname;
////        this.age = age;
////        this.address = address;
////        this.bvn = bvn;
////        this.dateTime = dateTime;
////    }
//
////    public Account(String accountNumber, String pin) {
////        this.accountNumber = accountNumber;
////        this.pin = pin;
////        this.balance = 0;
////    }
//
//    public Account(String fname, String lname, int age, String address, String bvn, String accountNumber) {
//        this.fname = fname;
//        this.lname = lname;
//        this.age = age;
//        this.address = address;
//        this.bvn = bvn;
//        this.dateTime = LocalDateTime.now();
//        this.accountNumber = accountNumber;
//    }
//
////    public Account(String accountNumber, int amount, String pin) {
////        this.accountNumber = accountNumber;
////        this.amount = amount;
////        this.pin = setPin("1234");
////    }
//
//
//    public String setPin(String pin) {
//        this.pin = pin;
//        return this.pin;
//    }
//
//    public String getPin() {
//        return pin;
//    }
//
//    public void setFname() {
//        this.fname = fname;
//    }
//
//    public void setBalance(int balance) {
//        this.balance = balance;
//    }
//
//    public void deposit(int amount) {
//        if (pin.equals(this.pin))
//            balance = balance + amount;
//        else throw new IllegalArgumentException("Invalid PIN");
//    }
//
//    public boolean withdraw(String pin, int amount) {
//        this.pin = pin;
//        if (pin.equals(this.pin))
//            balance = balance - amount;
//        else throw new IllegalArgumentException("Invalid PIN");
//
//
//        return false;
//    }
//
//    public int checkBalance(String pin) {
//        if (pin.equals(this.pin)) {
//            return balance;
//        } else {
//            throw new IllegalArgumentException("Invalid PIN");
//        }
//
//    }
//
//    public String getFname() {
//        return fname;
//    }
//
//    public void setAccountNumber(){
//        this.accountNumber = accountNumber;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public boolean checkPin(String pin) {
//        return this.pin.equals(pin);
//    }
//}
//
