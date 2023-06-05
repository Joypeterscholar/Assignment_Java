package codewars;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class MethodForSmallestTest{
    MethodForSmallest method = new MethodForSmallest();
    @Test
    public void testForSmallestNumber(){
       AssertJUnit.assertEquals(4, method.getSmallest(5,4,4));

    }



}
