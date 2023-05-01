import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntergersTest {
    private int num;
    private int value;
    private int result;
    private int output;
    private int num1;
    private int num2;
    @Test
public void testIntergerSquares(){
        num = 2;
      value = Intergers.square(num);
assertEquals(4, Intergers.square(2));
    }
    @Test
    public void testIntegerSumSquares(){
        num1 = 4;
            num2 = 2;
        result = Intergers.square(num1) + Intergers.square(num2);
        assertEquals(20, Intergers.sumOfSquares(4, 2));
    }
    @Test
    public void testIntergerDifferenceSquares(){
        num1 = 4;
        num2 = 2;
        output= Intergers.square(num1) - Intergers.square(num2);
        assertEquals(12, Intergers.subtractOfSquares(4, 2));
    }
}
