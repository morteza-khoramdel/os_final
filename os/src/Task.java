import java.util.HashMap;

public class Task {

    private StateTask state;
    private int time;
    private Priority priority;
    private String name;
    private HashMap<String, Integer> needed;

    public Task(StateTask state, Priority priority, String name) {
        this.name = name;
        this.state = state;
        this.priority = priority;
        needed = new HashMap<>();
        if (priority.equals(Priority.X)) {
            needed.put("A", 1);
            needed.put("B", 1);
        } else if (priority.equals(Priority.Y)) {
            needed.put("C", 1);
            needed.put("B", 1);
        } else if (priority.equals(Priority.Z)) {
            needed.put("A", 1);
            needed.put("C", 1);
        }


    }

    public StateTask getState() {
        return state;
    }

    public void setState(StateTask state) {
        this.state = state;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
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

    public HashMap<String, Integer> getNeeded() {
        return needed;
    }

    public void setNeeded(HashMap<String, Integer> needed) {
        this.needed = needed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                '}';
    }
}
