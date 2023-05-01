import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
public class PalindromeTest {
    Palindrome palindrome = new Palindrome();
@Test
    public void testThatStringIsAPalindrome(){
    palindrome = new Palindrome();
    palindrome.setPalindrome(11011);
Assertions.assertEquals(11011, Palindrome.getPalindrome());
}
}