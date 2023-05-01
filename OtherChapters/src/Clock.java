public class Clock {
    public int hour;
    public int minute;
    public int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;


    }

    public static void main(String[] args) {

    }

    public void setHour(int hour) {
        if (hour > 23 && minute > 59 && second > 59) {
            hour = 0;
            minute = 0;
            second = 0;
        }
    }

    public void setMinute(int minute) {
        if (hour > 23 && minute > 59 && second > 59) {
            hour = 0;
            minute = 0;
            second = 0;
        }
    }

    public void setSecond(int second) {
        if (hour > 23 && minute > 59 && second > 59) {
            hour = 0;
            minute = 0;
            second = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String displayTime() {
        return "hour:minute:second";
    }
}