package codewars;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class AverageOfElementsInAnArrayTest {

    AverageOfElementsInAnArray average = new AverageOfElementsInAnArray();
    @Test
    public void testForAverage() {
        int[] actual = {1,3,5,7,9,5,8,3,5,2};
        int[] expected ={2,6,7,5,3};
  Assertions.assertArrayEquals(expected, AverageOfElementsInAnArray.setArray(actual));

    }
}


