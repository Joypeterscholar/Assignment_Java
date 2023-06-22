public class Account {
    private String  name;
    private int accountNumber;
    private double balance;

    public void setName(String peterJoy){
        this.name = peterJoy;
    }
    public String getName(){
        return name;
    }
    public void setAccountNumber(int newAccountNumber){
        this.accountNumber = newAccountNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double moneyToAdd) {
        balance = balance + moneyToAdd;
    }

    public void withdraw(double moneyToWithdraw) {
        balance = balance - moneyToWithdraw;
    }

}

