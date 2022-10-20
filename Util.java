import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Util {
    // assume input will be a string of integers.
    public static int[] getData() {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        sc.close();

        String[] words = line.split("\\s");
        List<Integer> list = new ArrayList<>();
        int n = 0;
        for (String sNum : words) {
            try {
                n = Integer.parseInt(sNum);
                list.add(n);
            } catch (NumberFormatException e) {
                // ignore non integer
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }

        return res;
    }

    public static void checkArgument(String progName, String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: " + progName + " (1|2|3)");
            System.exit(0);
        }

        if (Problem.getRoutineName(args[0]) == null) {
            System.out.println("Not registered method: " + args[0]);
            System.exit(0);
        }
    }
}
