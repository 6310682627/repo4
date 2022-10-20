import java.util.HashMap;
import java.util.Map;

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
