//package Bank;
//
////import sun.net.InetAddressCachePolicy;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class Bank {
////    String fname;
//    private String lname;
////    private int age;
////    private String address;
////    private String bvn;
////    private String pin;
////    private String accountNumber;
////    int balance;
////
////    private LocalDateTime dateTime = LocalDateTime.now();
////    static List<Account> accounts;
////    private Account accNo;
////
////
////    public Bank(Account account) {
////        this.fname = fname;
////        this.lname = lname;
////        this.age = age;
////        this.address = address;
////        this.bvn = bvn;
////        this.pin = pin;
////        this.accountNumber = accountNumber;
////        accounts = new ArrayList<>();
////    }
////
////    public void registerNewCustomer(Account account) {
////        account = new Account(fname, lname, age, address, bvn, dateTime, accountNumber);
////        accounts.add(account);
////    }
////
////    public int countAccount() {
////        return accounts.size();
////    }
////
////
////    public static Account findAccount(String accountNumber) {
////        for (Account account : accounts) {
////            if (account != null && account.getAccountNumber().equals(accountNumber)) {
////                return account;
////            }
////        }
////        return null ;
////    }
////
////    public int deposit(String accountNumber, int balance) {
////        Account account = findAccount(accountNumber);
////            if (account.accountNumber.equals(accountNumber)) {
////                return account.balance += balance;
////            }
////        return balance;
////    }
////
////
////        public static int withdraw(String accountNumber, int balance, String pin){
////            for (Account account : accounts) {
////                account = findAccount(accountNumber);
////                if (account.accountNumber.equals(accountNumber) && account.getPin().equals(pin) ){
////                    return account.balance -= balance;
////                }
////            }
////            return 0;
////        }
////
////    public static int transfer(Account sender, Account reciever, int balance, String pin) {
////        for (Account account : accounts) {
////            sender = findAccount(sender.accountNumber);
////            reciever = findAccount(reciever.accountNumber);
////            if(sender != null && reciever != null){
////                if (sender.checkPin(pin)){
////                    if (sender.withdraw(pin,balance)){
////                        reciever.deposit(balance);
////                    }
////                }
////            }
//////         if (account.getPin().equals(pin)){
//////             sender.balance -= balance;
//////                 return reciever.balance += balance ;
//////             }
////         }
////        return 0;
////    }
//}
//
