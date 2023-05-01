import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
public class ClockTest {
    private Clock clock;
    @BeforeEach
private void setUp(){
        clock = new Clock(5, 45, 10);}
@Test
public void testForHour(){
        clock.setHour(5);
   assertEquals(5, clock.getHour());
}
    @Test
    public void testForMinute(){
        clock.setMinute(45);
        assertEquals(45, clock.getMinute());
    }
    @Test
    public void testForSecond(){
        clock.setSecond(10);
        assertEquals(10, clock.getSecond());
    }
}
