package Bank;

import Diary.Entry;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    private LocalDateTime dateTime;
    Bank bank = new Bank(new Account("fname", "lname", 0, "address", "0000", dateTime));

    @Test
    public void testThatBankExist() {
        bank = new Bank(new Account("fname", "lname", 0, "address", "0000", dateTime));
        Assert.assertNotNull(bank);
    }

    @Test
    public void testThatICanRegisterNewCustomers() {
        testThatBankExist();
        LocalDateTime dateTime = LocalDateTime.now();
        Account account1 = new Account("joy", "peter", 25, "beside unilag", "000000", dateTime);
        Account account2 = new Account("alex", "lincolin", 20, "akoka", "2002000", dateTime);
        Account account3 = new Account("sarah", "ken", 50, "lokoja", "1101000", dateTime);
        bank.registerNewCustomer(account1);
        assertEquals(1, bank.countAccount());
    }

    @Test
    public void testThatICanfindCustomersByFname() {
        testThatBankExist();
        Account account1 = new Account("joy", "peter", 25, "beside unilag", "000000", dateTime, "5544667733");
        Account account2 = new Account("alex", "lincolin", 20, "akoka", "2002000", dateTime, "6655774488");
        Account account3 = new Account("sarah", "ken", 50, "lokoja", "1101000", dateTime, "33221144");
        bank.accounts.add(account1);
        bank.accounts.add(account2);
        bank.accounts.add(account3);
        assertEquals(account1, bank.findAccountByFname("joy"));

    }

    @Test
    public void testThatICanDeposit() {
        testThatBankExist();
        Account account1 = new Account("joy", "peter", 25, "beside unilag", "000000", dateTime, "5544667733");
        bank.accounts.add(account1);
        account1.setPin("1234");
        bank.deposit("5544667733", 5000);
        Assert.assertEquals(5000, account1.checkBalance("1234"));

    }

    @Test
    public void testThatICanWithdraw(){
        Account account1 = new Account("joy", "peter", 25, "beside unilag", "000000", dateTime, "5544667733");
        bank.accounts.add(account1);
        account1.setPin("1234");
        account1.setBalance(5000);
        bank.withdraw("5544667733",3000, "1234");
        assertEquals(2000, account1.checkBalance("1234"));
    }
    @Test
    public void testThatICanTransfer(){
        Account sender = new Account("joy", "peter", 25, "beside unilag", "000000", dateTime, "5544667733");
        Account reciever = new Account("alex", "lincolin", 20, "akoka", "2002000", dateTime, "6655774488");
        bank.accounts.add(sender);
        bank.accounts.add(reciever);
        sender.setPin("1234");
        reciever.setPin("1234");
        sender.setBalance(5000);
        reciever.setBalance(2000);
        bank.transfer(sender, reciever, 4000, "1234");
        assertEquals(6000, reciever.checkBalance("1234"));
        assertEquals(1000, sender.checkBalance("1234"));    }
    }

////     List <Account> Expected = List.of(account1, account2, account3, account4, account5);
