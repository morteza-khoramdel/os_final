public class Queue {
    private java.util.Queue<Task> waitingTask ;
    private java.util.Queue<Task> readyTask ;

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
