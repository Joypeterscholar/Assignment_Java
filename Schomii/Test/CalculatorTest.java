import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void addNUmbers() {
        assertEquals(11, calculator.addition(8,3));

    }

    @Test
    public void subtractNUmbers(){
        assertEquals(5, calculator.subtraction(3, 8));
    }

    @Test
    public void multiplyNUmbers(){
        assertEquals(8  * 3,calculator.multiply(8,3));
    }
    @Test
    public void quotientOfNUmbers(){
        assertEquals(8 / 3, calculator.quotient(8, 3));
    }
}
