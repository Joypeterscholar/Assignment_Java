//AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AirConditionerTest {
    AirConditioner ac = new AirConditioner();

    @Test
    public void canTurnACOn(){
        ac.checkAC(true);
        ac.acOn(false);
        ac.acOff(true);
        ac.getStatus();
        assertEquals(true, ac.getStatus());
    }

    @Test
    public void canTurnACOff(){
        ac.checkAC(true);
        ac.acOn(true);
        ac.acOff(false);
        ac.getStatus();
        assertEquals(true, ac.getStatus());
    }

    @Test
    public void increaseTemperature(){
        ac.checkAC(true);
        ac.acOn(true);
        ac.temperature("low");
        ac.getTemperature();
        assertEquals("Temperature increase", ac.getTemperature());
    }
    @Test
    public void decreaseTemperature(){
        ac.checkAC(true);
        ac.acOn(true);
        ac.temperature("high");
        assertEquals("Temperature decrease", ac.getTemperature());
    }


}