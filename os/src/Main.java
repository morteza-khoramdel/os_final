
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

    public static void main(String[] args) {
        init();
        startTasks();
    }

    private static void startTasks() {
        while (tasks.size()!=0){

        }
    }

    private static void init() {
        resourceMap = new HashMap<>();
        tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        resourceMap.put(Resource.A, sc.nextInt());
        resourceMap.put(Resource.B, sc.nextInt());
        resourceMap.put(Resource.C, sc.nextInt());
        int numberTask = sc.nextInt();
        for (int i = 0; i < numberTask; i++) {
            sc.nextLine();
            String eachTask = sc.nextLine();
            System.out.println(eachTask);
            String[] eachInfo = eachTask.split(" ");//0 name  1 priority 2 taskDuration
            int taskDuration = Integer.parseInt(eachInfo[2]);
            System.out.println(taskDuration);
            tasks.add(new Task(StateTask.READY,
                    eachInfo[1].equals("X") ? Priority.X : (eachInfo[1].equals("Y") ? Priority.Y : (eachInfo[1].equals("Z") ? Priority.Z : Priority.X))
                    , eachInfo[0], taskDuration));
        }
        CPU cpu = new CPU();

    }
}
