import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    void testForName() {
        Account account = new Account();
        account.setName("Joy Abdul");
        System.out.println(account.getName());
        account.setName("Abakaliki");
        System.out.println(account.getName());

        account.setAccountNumber(654);
        System.out.println(account.getAccountNumber());
    }

    @Test
    void checkThatICanDepositMoneyInMyAccount() {
        Account account = new Account();
        assertEquals(0.0, account.getBalance());
        account.deposit(2000);
        assertEquals(2000.0, account.getBalance());
    }

    @Test
    void checkThatICanWithdrawMoneyFromMyAccount() {
        Account account = new Account();
        assertEquals(0.0, account.getBalance());
        account.deposit(2000);
        assertEquals(2000.0, account.getBalance());
        account.withdraw(1000);
        assertEquals(1000.0, account.getBalance());
    }
}
