import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

import org.testng.AssertJUnit;

public class BrainBreakTest {
    @Test
    public void testThatIcanGetNumberOfCount(){
        int [] num = {5,6,7,8,9,2,9};
        BrainBreak.setCount(num);
        assertEquals(2, BrainBreak.getCount());
    }
}
