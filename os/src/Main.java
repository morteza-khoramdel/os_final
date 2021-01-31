import Enum.Resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

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
        CPU cpu1 = new CPU(1);
        CPU cpu2 = new CPU(2);
        CPU cpu3 = new CPU(3);
        CPU cpu4 = new CPU(4);
    }
}
