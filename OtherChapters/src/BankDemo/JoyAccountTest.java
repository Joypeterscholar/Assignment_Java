package BankDemo;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class JoyAccountTest {

    @Test
    public void testThatWeCanCreateAccount() {
        JoyAccount account;
        account = new JoyAccount("Joy", "Peter", 25, "Juno Hostel, Delta", "1234567899", "1234");
        assertNotNull(account);
    }

    @Test
    public void testCheckBalance() {
        JoyAccount account = new JoyAccount("Joy", "Peter", 25, "Juno Hostel, Delta", "1234567899", "1234", 7250);
        assertEquals(7250, account.checkBalance());
    }

    @Test
    public void testThatWeCanDeposit() {
      JoyAccount account = new JoyAccount("Joy", "Peter", 25, "Juno Hostel, Delta", "1234567899", "1234");
      assertEquals(0, account.checkBalance());
      account.deposit(5000);
      assertEquals(5000, account.checkBalance());
    }

    @Test
    public void testThatWeCannotDepositANumberLessThanZero() {
        JoyAccount account = new JoyAccount("Joy", "Peter", 25, "Juno Hostel, Delta", "1234567899", "1234");
        assertEquals(0, account.checkBalance());
        account.deposit(5000);
        assertEquals(5000, account.checkBalance());
        account.deposit(-4500);
        assertEquals(5000, account.checkBalance());
    }

    @Test
    public void testThatWeCanWithdraw() {
        JoyAccount account = new JoyAccount("Joy", "Peter", 25, "Juno Hostel, Delta", "1234567899", "1234");
        assertEquals(0, account.checkBalance());
        account.deposit(5000);
        assertEquals(5000, account.checkBalance());
        account.withdraw(2700);
        assertEquals(2300, account.checkBalance());
    }

    @Test
    public void testThatWeCantWithdrawNegativeAmount() {
        JoyAccount account = new JoyAccount("Joy", "Peter", 25, "Juno Hostel, Delta", "1234567899", "1234");
        assertEquals(0, account.checkBalance());
        account.deposit(5000);
        assertEquals(5000, account.checkBalance());
        account.withdraw(-2000);
        assertEquals(5000, account.checkBalance());
    }

    @Test
    public void testThatWeCantWithdrawAboveBalance() {
        JoyAccount account = new JoyAccount("Joy", "Peter", 25, "Juno Hostel, Delta", "1234567899", "1234");
        assertEquals(0, account.checkBalance());
        account.deposit(5000);
        assertEquals(5000, account.checkBalance());
        account.withdraw(7000);
        assertEquals(5000, account.checkBalance());
    }


}