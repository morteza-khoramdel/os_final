
import java.util.LinkedList;
import java.util.Queue;

public class CPU {

    private Core[] cores;
    private Queue<Task> queue;

    CPU() {
        cores = new Core[4];
        queue =new LinkedList<>();
    }

    public Core[] getCores() {
        return cores;
    }

    public void setCores(Core[] cores) {
        this.cores = cores;
    }

    public Queue<Task> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Task> queue) {
        this.queue = queue;
    }
}
