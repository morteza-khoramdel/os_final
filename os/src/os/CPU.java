package os;

public class CPU {

    private Core[] cores;
    private QueueScheduling queue;

    CPU() {
        cores = new Core[4];
        for (Core core : cores) {
            core.start();
        }
        queue = new QueueScheduling();
    }

    public Core[] getCores() {
        return cores;
    }

    public void setCores(Core[] cores) {
        this.cores = cores;
    }

    public QueueScheduling getQueue() {
        return queue;
    }

    public void setQueue(QueueScheduling queue) {
        this.queue = queue;
    }
}
