public class Television {
    private boolean isOn;
    private int channel = 1;
    private int vol = 0;

    public boolean isOn() {
        return isOn;
    }
    public void switchButton(){
        isOn = !isOn;
    }

    public void setChannel(int channel){
        if (channel > 0 && channel < 101) this.channel = channel;
        else this.channel = 1;
    }
    public int changeChannel() {
        return channel;
    }
    public int increaseVol() {
        //this.vol = vol;
        if (vol >= 0 && vol <= 99) return vol++;
        else if (vol == 100) return 100;
         else return 0;
    }
    public int decreaseVol(){
        if (vol >= 1 && vol <= 100) return vol--;
        else if (vol == 0) return 0;
        else return 0;
    }
}

