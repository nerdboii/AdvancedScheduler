package Time;

public class HourMinute {
    protected int hour;
    protected int minute;
    public HourMinute(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    public HourMinute(String timeString) {
        String[] temp;
        temp = timeString.split(":", 2);
        this.hour = Integer.parseInt(temp[0]);
        this.minute = Integer.parseInt(temp[1]);
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public String getString() {
        String result = "";
        result = hour + ":" + minute;
        return result;
    }
    @Override
    public HourMinute clone() {
        HourMinute clone = new HourMinute(0, 0);
        clone.hour = this.hour;
        clone.minute = this.minute;
        return clone;
    }
    public void swap(HourMinute a, HourMinute b) {
        HourMinute temp = new HourMinute(0, 0);
        temp = a.clone();
        a = b.clone();
        b = temp;
    }
    public boolean isEqual(HourMinute a) {
        return this.hour == a.getHour() && this.minute == a.getMinute();
    }
    public boolean isSmaller(HourMinute a) {
        return this.hour < a.getHour() ||
                (this.hour == a.getHour() && this.minute < a.getMinute());
    }
    public boolean isBetween(HourMinute a, HourMinute b) {
        return !this.isSmaller(a) && this.isSmaller(b);
    }
    public HourMinute getDuration(HourMinute a, HourMinute b) {
        HourMinute result = new HourMinute(0, 0);
        if (a.isSmaller(b))
            swap(a, b);

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
    public HourMinute getDuration(HourMinute b) {
        return getDuration(this, b);
    }
}
