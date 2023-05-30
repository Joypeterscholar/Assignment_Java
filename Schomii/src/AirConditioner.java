
public class AirConditioner {
    boolean ac, on, off;
    String temp;
    public boolean checkAC(boolean check) {
        ac = check;
        return true;
    }

    public void acOn(boolean status) {
        on = status;
    }

    public void acOff(boolean status) {
        off = status;
    }

    public boolean getStatus() {
        if(ac == true && off == true) return on = true;
        if(ac ==true && on == true) return off = true;
        else return false;
    }


    public void temperature(String tempeature) {
        temp = tempeature;
    }

    public String getTemperature() {
        if(temp == "low") return "Temperature increase";
        else if (temp == "high") return "Temperature decrease";
        else return "Checking inputs";
    }
}
