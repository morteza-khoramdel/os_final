package os;

import os.AlgorithmScheduling.Algorithm;
import os.AlgorithmScheduling.FCFS;
import os.AlgorithmScheduling.RR;
import os.AlgorithmScheduling.SJF;
import os.Enum.Priority;
import os.Enum.Resource;
import os.Enum.StateTask;

import java.util.*;

public class Main {
    private static HashMap<Resource, Integer> resourceMap;
    private static QueueScheduling queueScheduling;
    private static final int allTime = 0;
    private static final Scanner sc = new Scanner(System.in);
    private static Algorithm algorithm;

    public static void main(String[] args) {
        init();
        startTasks();
    }

    private static void startTasks() {
        CPU cpu = new CPU();

        while (queueScheduling.getReadyTask().size() != 0 && queueScheduling.getWaitingTask().size() != 0) {
            //sort by Scheduling
            algorithm.runScheduling(queueScheduling);

//            for (int i = 0; i < queueScheduling.getReadyTask().size(); i++) {
//                Task task = queueScheduling.getReadyTask().peek();
//                if (Objects.requireNonNull(task).canAssigned()) {
//
//                } else {
//                    Queue<Task> queue = queueScheduling.getWaitingTask();
//                    queue.add(task);
//                    queueScheduling.setWaitingTask(queue);
//                }
//            }

        }
    }

    private static void init() {
        resourceMap = new HashMap<>();
        queueScheduling = new QueueScheduling();
        java.util.Queue<Task> queueReady = new LinkedList<>();
        System.out.println("Welcome to My Scheduler");
        System.out.println("Please Enter Resource A B C");
        resourceMap.put(Resource.A, sc.nextInt());
        resourceMap.put(Resource.B, sc.nextInt());
        resourceMap.put(Resource.C, sc.nextInt());
        System.out.println("Please Enter Number of Tasks");
        int numberTask = sc.nextInt();
        System.out.println("Please Enter Information of Tasks");
        for (int i = 0; i < numberTask; i++) {
            if (i == 0)
                sc.nextLine();
            String eachTask = sc.nextLine();
            String[] eachInfo = eachTask.split(" ");//0 name  1 priority 2 taskDuration
            int taskDuration = Integer.parseInt(eachInfo[2]);
            queueReady.add(new Task(StateTask.READY,
                    eachInfo[1].equals("X") ? Priority.X : (eachInfo[1].equals("Y") ? Priority.Y : (eachInfo[1].equals("Z") ? Priority.Z : Priority.X))
                    , eachInfo[0], taskDuration));
        }
        queueScheduling.setReadyTask(queueReady);
        initScheduling();

    }

    private static void initScheduling() {
        System.out.println("Please Enter Your Algorithm :\n  1)FCFS  \n 2)RR  \n 3)SJF");
        int temp = sc.nextInt();
        switch (temp) {
            case 1:
                algorithm = new FCFS();
            case 2:
                algorithm = new RR();
            case 3:
                algorithm = new SJF();
        }

    }
}
