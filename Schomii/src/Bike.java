package tdd;

public class Bike {
    boolean own, on,off;
    int speed;
    public void getBike(boolean bike) {
        own = bike;
    }

    public void bikeOn(boolean status) {
        on = status;
    }
    public void bikeOff(boolean status){
        off = status;
    }
    public boolean getStatus(){
        if (own == true && off == true) return on =true;
        else return off = true;
    }

    public void accelerateBike(int speed) {
        this.speed = speed;
    }
    public int getAccelerateGear(){
        if(speed > -1 && speed < 21) return speed = speed + 1;
        else if (speed > 20 && speed < 31) return speed = speed + 2;
        else if (speed > 30 && speed < 41) return speed = speed + 3;
        else if (speed > 40) return speed =  speed+ 4;
        else return speed = 0;

    }

    public int getDeccelerateGear(){
        if(speed > -1 && speed < 21) return speed = speed - 1;
        else if (speed > 20 && speed < 31) return speed = speed - 2;
        else if (speed > 30 && speed < 41) return speed = speed - 3;
        else if (speed > 40) return speed =  speed - 4;
        else return speed = 0;
    }
}
