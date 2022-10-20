import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// assume input will be an array of integers.
interface Routine {
    void execute(int[] data);
}

class Problem {
    private static final Map<String, Routine> routineMap = new HashMap<String, Routine>();

    public static void register(String routineName, Routine routine) {
        routineMap.put(routineName, routine);
    }

    public static String getRoutineName(String routineName) {
        Routine routine = routineMap.get(routineName);
        if (routine == null) {
            return null;
        }
        return routine.toString();
    }

    public static void run(String routineName, int[] data) {
        Routine routine = routineMap.get(routineName);
        if (routine == null) {
            System.out.println("No command: " + routineName);
            System.exit(0);
        }
        routine.execute(data);
    }
}

class Maxi implements Routine {
    private static int maximum(int[] data) {
        int currentMax = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > currentMax) {
                currentMax = data[i];
            }
        }

        return currentMax;
    }

    @Override
    public String toString() {
        return "maximum";
    }

    @Override
    public void execute(int[] data) {
        if (data == null || data.length == 0) {
            System.out.println("Invalid input");
            System.exit(0);
        }

        System.out.println("Data: " + Arrays.toString(data));
        System.out.println("Maximum: " + maximum(data));
    }
}

class Mini implements Routine {
    private static int minimum(int[] data) {
        int currentMin = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < currentMin) {
                currentMin = data[i];
            }
        }

        return currentMin;
    }

    @Override
    public String toString() {
        return "minimum";
    }

    @Override
    public void execute(int[] data) {
        if (data == null || data.length == 0) {
            System.out.println("Invalid input");
            System.exit(0);
        }

        System.out.println("Data: " + Arrays.toString(data));
        System.out.println("Minimum: " + minimum(data));
    }
}
