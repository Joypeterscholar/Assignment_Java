import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Assertions;
public class TelevisionTest {

Television tv = new Television();
@Test
    public void testTVIsPresent(){
    assertNotNull(tv);
}
@Test
    public void testTurnTVOn(){
    //given
      assertNotNull(tv);

      //when
        assertFalse(tv.isOn());
        tv.switchButton();
        //assert
        assertEquals(true, tv.isOn());
    }
    @Test
    public void testTVChangeChannel(){
    //given
        assertNotNull(tv);
        if (tv.isOn() == false) tv.switchButton();
        assertTrue(tv.isOn());

        //when
        tv.setChannel(5);
        //assert
        assertEquals(5, tv.changeChannel());
    }

    @Test
    public void testIncreaseVolume(){
    //given
        assertNotNull(tv);
        if(tv.isOn() == false) tv.switchButton();
        //when
        tv.increaseVol();
        tv.increaseVol();
        //assert
        assertEquals(2, tv.increaseVol());

    }

    @Test
    public void testDecreaseVolume(){
        //given
        assertNotNull(tv);
        if(tv.isOn() == false) tv.switchButton();
        //when
        tv.decreaseVol();
        tv.decreaseVol();
        //assert
        assertEquals(0, tv.decreaseVol());

    }
}