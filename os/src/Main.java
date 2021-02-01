
import Algorithm.Algorithm;
import Algorithm.FCFS;
import Algorithm.RR;
import Algorithm.SJF;
import Enum.Priority;
import Enum.Resource;
import Enum.StateTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<Resource, Integer> resourceMap;
    private static ArrayList<Task> tasks;
    private static int allTime = 0;
    private static Scanner sc = new Scanner(System.in);
    private static Algorithm algorithm;

    public static void main(String[] args) {
        init();
        startTasks();
    }

    private static void startTasks() {
        CPU cpu = new CPU();
        while (tasks.size() != 0) {

        }
    }

    private static void init() {
        resourceMap = new HashMap<>();
        tasks = new ArrayList<>();
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
            tasks.add(new Task(StateTask.READY,
                    eachInfo[1].equals("X") ? Priority.X : (eachInfo[1].equals("Y") ? Priority.Y : (eachInfo[1].equals("Z") ? Priority.Z : Priority.X))
                    , eachInfo[0], taskDuration));
        }
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
