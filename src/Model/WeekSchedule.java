package Model;

public class WeekSchedule {
    public DaySchedule mon;
    public DaySchedule tue;
    public DaySchedule wed;
    public DaySchedule thu;
    public DaySchedule fri;
    public DaySchedule sat;
    public DaySchedule sun;
    public WeekSchedule() {
        mon = new DaySchedule("Monday");
        tue = new DaySchedule("Tuesday");
        wed = new DaySchedule("Wednesday");
        thu = new DaySchedule("Thursday");
        fri = new DaySchedule("Friday");
        sat = new DaySchedule("Saturday");
        sun = new DaySchedule("Sunday");
    }
}
