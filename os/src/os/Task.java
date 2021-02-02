package os;

import os.Enum.Priority;
import os.Enum.Resource;
import os.Enum.StateTask;

import java.util.HashMap;

public class Task {

    private boolean isAssigned = false;
    private StateTask state;
    private int untilTime;
    private Priority priority;
    private String name;
    private final HashMap<Resource, Integer> needed;
    private int taskDuration;

    public Task(StateTask state, Priority priority, String name, int taskDuration) {
        this.name = name;
        this.state = state;
        this.priority = priority;
        this.taskDuration = taskDuration;
        needed = new HashMap<>();
        if (priority.equals(Priority.X)) {
            needed.put(Resource.A, 1);
            needed.put(Resource.B, 1);
        } else if (priority.equals(Priority.Y)) {
            needed.put(Resource.C, 1);
            needed.put(Resource.B, 1);
        } else if (priority.equals(Priority.Z)) {
            needed.put(Resource.A, 1);
            needed.put(Resource.C, 1);
        }


    }

    public StateTask getState() {
        return state;
    }

    public void setState(StateTask state) {
        this.state = state;
    }

    public int getUntilTime() {
        return untilTime;
    }

    public void setUntilTime(int untilTime) {
        this.untilTime = untilTime;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Resource, Integer> getNeeded() {
        return needed;
    }


    public int getTaskDuration() {
        return taskDuration;
    }

    public void setTaskDuration(int taskDuration) {
        this.taskDuration = taskDuration;
    }

    public boolean isAssigned() {
        return isAssigned;
    }
    public boolean canAssigned(){
        return true;
    }
    public void setAssigned(boolean assigned) {
        isAssigned = assigned;
    }

    @Override
    public String toString() {
        return "os.Task{" +
                "name='" + name + '\'' +
                '}';
    }
}
