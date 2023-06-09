package Lyzs;

import org.junit.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.testng.AssertJUnit;


public class LyzsTest {
    Lyzs  lyst = new Lyzs();
    @Test 
    public void testThatICanAdd(){
        lyst = new Lyzs();
        lyst.add(0,7);
        lyst.add(1,5);
        lyst.add(2,9);
        lyst.add(3,7);
        lyst.add(4,5);
        lyst.add(5,9);
        lyst.add(6,7);
        lyst.add(7,5);
        lyst.add(8,9);
        lyst.add(9,7);
        AssertJUnit.assertEquals(7, lyst.get(0));
        AssertJUnit.assertEquals(5, lyst.get(1));
        AssertJUnit.assertEquals(9, lyst.get(2));
        AssertJUnit.assertEquals(7, lyst.get(3));
        AssertJUnit.assertEquals(5, lyst.get(4));
        AssertJUnit.assertEquals(9, lyst.get(5));
        AssertJUnit.assertEquals(7, lyst.get(6));
        AssertJUnit.assertEquals(5, lyst.get(7));
        AssertJUnit.assertEquals(9, lyst.get(8));
        AssertJUnit.assertEquals(7, lyst.get(9));
    }
    @Test
    public void testForSize(){
        lyst = new Lyzs();
        lyst.add(0,7);
        lyst.add(1,5);
        lyst.add(2,9);
        lyst.add(3,7);
        lyst.add(4,5);
        lyst.add(5,9);
        lyst.add(6,7);
        lyst.add(7,5);
        AssertJUnit.assertEquals(8, lyst.size());

    }
    @Test
    public void testForClear(){
        lyst = new Lyzs();
        lyst.add(0,7);
        lyst.add(1,5);
        lyst.add(2,9);
        lyst.add(3,7);
        lyst.add(4,5);
        lyst.add(5,9);
        lyst.add(6,7);
        lyst.add(7,5);
        AssertJUnit.assertEquals(0, lyst.clear());
    }
    @Test
    public void testThatICanRemove(){
        lyst = new Lyzs();
        lyst.add(0,7);
        lyst.add(1,5);
        lyst.add(2,9);
        lyst.add(3,7);
        lyst.add(4,5);
        lyst.add(5,9);
        lyst.add(6,7);
        lyst.add(7,5);
        lyst.remove(3);
        AssertJUnit.assertEquals(5, lyst.get(3));
    }
}
