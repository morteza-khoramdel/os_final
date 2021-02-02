package os;

import os.Enum.StateCore;

public class Core extends Thread {
    private StateCore stateCore = StateCore.IDLE;
    private Task activeTask;

    public StateCore getStateCore() {
        return stateCore;
    }

    public void setStateCore(StateCore stateCore) {
        this.stateCore = stateCore;
    }

    public Task getActiveTask() {
        return activeTask;
    }

    public void setActiveTask(Task activeTask) {
        this.activeTask = activeTask;
    }

    @Override
    public void run() {
        super.run();
        while (true){

        }
    }
}
