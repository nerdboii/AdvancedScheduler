package Model;

import Time.HourMinute;

public class Task {
    String name;
    String start;
    String end;
    HourMinute duration;
    public Task(String name, String start, String end, HourMinute duration) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.duration = duration;
    }
    public Task(String name, HourMinute duration) {
        this.name = name;
        this.duration = duration;
    }
    public Task(String name, String start, HourMinute duration) {
        this.name = name;
        this.start = start;
        this.duration = duration;
    }
    public String getName() {
        return name;
    }
    public String getStart() {
        return start;
    }
    public String getEnd() {
        return end;
    }
    public HourMinute getDuration() {
        return duration;
    }
}
