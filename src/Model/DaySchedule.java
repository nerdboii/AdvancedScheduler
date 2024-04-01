package Model;

import java.util.ArrayList;

public class DaySchedule {
    public final int hours = 24;
    String day;
    ArrayList<Task> taskList;
    public DaySchedule(String day) {
        this.day = day;
        taskList = new ArrayList<Task>();
    }
    public String getDay() {
        return day;
    }
    public ArrayList<Task> getTaskList() {
        return taskList;
    }
    public int getTaskAmount() {
        return taskList.size();
    }
    public void addTask(Task task) {
        taskList.add(task);
    }
    public void removeTask(Task task) {
        taskList.remove(task);
    }
    public void insertTask(Task task, Task replacedTask) {
        int replacedIndex = taskList.indexOf(replacedTask);
        taskList.add(replacedIndex, task);
    }
}
