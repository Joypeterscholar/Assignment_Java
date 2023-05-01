import org.junit.jupiter.api.Test;
import tdd.Bike;

import static org.junit.Assert.assertEquals;

public class BikeTest {
    Bike bike = new Bike();
    @Test
    public void bikeCanTurnOn(){
        bike.getBike(true);
        bike.bikeOff(true);
        assertEquals(true, bike.getStatus());
    }

    @Test
    public void bikeCanTurnOff(){
        bike.getBike(true);
        bike.bikeOn(true);
        assertEquals(true, bike.getStatus());
    }

    @Test
    public void checkBikeAecceleration(){
        bike.getBike(true);
        bike.bikeOn(true);
        bike.accelerateBike(30);
      //  assertEquals(32, bike.getAccelerateGear());
    //}

    //@Test
    //public void checkBikeDecceleartion(){
       // bike.getBike(true);
      //  bike.bikeOn(true);
        //bike.accelerateBike(30);
        //assertEquals(28, bike.getDeccelerateGear());
    }
}
