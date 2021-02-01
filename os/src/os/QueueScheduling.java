package os;

import java.util.LinkedList;

public class QueueScheduling {
    private java.util.Queue<Task> waitingTask;
    private java.util.Queue<Task> readyTask;

    QueueScheduling() {
        waitingTask = new LinkedList<>();
        readyTask = new LinkedList<>();
    }

    public java.util.Queue<Task> getWaitingTask() {
        return waitingTask;
    }

    public void setWaitingTask(java.util.Queue<Task> waitingTask) {
        this.waitingTask = waitingTask;
    }

    public java.util.Queue<Task> getReadyTask() {
        return readyTask;
    }

    public void setReadyTask(java.util.Queue<Task> readyTask) {
        this.readyTask = readyTask;
    }
}
