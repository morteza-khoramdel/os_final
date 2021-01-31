
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import Enum.*;
public class Main {
    private static HashMap<Resource, Integer> resourceMap;
    private static ArrayList<Task> tasks;

    public static void main(String[] args) {
        init();
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
            String eachTask = sc.nextLine();
            String[] eachInfo = eachTask.split(" ");//0 name  1 priority 2 taskDuration
            tasks.add(new Task(StateTask.WAITING,(
                    eachInfo[1].equals("X")?Priority.X:(eachInfo[1].equals("Y")?Priority.Y:(eachInfo[1].equals("Z")?Priority.Z:Priority.X)))
                    ,eachInfo[0],Integer.parseInt(eachInfo[2])));
        }
        CPU cpu1 = new CPU(1);
        CPU cpu2 = new CPU(2);
        CPU cpu3 = new CPU(3);
        CPU cpu4 = new CPU(4);
    }
}
