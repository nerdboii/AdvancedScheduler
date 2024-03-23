package Time;

public class HourMinute {
    protected int hour;
    protected int minute;
    HourMinute(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    HourMinute(String timeString) {
        String[] temp;
        temp = timeString.split(":", 2);
        this.hour = Integer.parseInt(temp[0]);
        this.minute = Integer.parseInt(temp[1]);
    }
    int getHour() {
        return hour;
    }
    int getMinute() {
        return minute;
    }
    void setHour(int hour) {
        this.hour = hour;
    }
    void setMinute(int minute) {
        this.minute = minute;
    }
    String getString() {
        String result = "";
        result = hour + ":" + minute;
        return result;
    }
    HourMinute getDuration(HourMinute a, HourMinute b) {
        HourMinute result = new HourMinute(0, 0);
        int resHour = a.getHour() - b.getHour();
        int resMinute = a.getMinute() - b.getMinute();
        if (resMinute < 0) {
            resHour--;
            resMinute += 60;
        }
        result.setHour(resHour);
        result.setMinute(resMinute);
        return result;
    }
    boolean isEqual(HourMinute a) {
        return this.hour == a.getHour() && this.minute == a.getMinute();
    }
    boolean isSmaller(HourMinute a) {
        return this.hour < a.getHour() ||
                (this.hour == a.getHour() && this.minute < a.getMinute());
    }
    boolean isBetween(HourMinute a, HourMinute b) {
        return !this.isSmaller(a) && this.isSmaller(b);
    }
}
