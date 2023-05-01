import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ReverseTest {
    Reverse reverse = new Reverse();
    @Test
    public void testThatNameHasBeenReversed(){
        //given
        reverse.setName("Scholar");
        //when
        reverse.getName();
        //assert
        assertEquals("ralohcS", reverse.getName());
    }
}
