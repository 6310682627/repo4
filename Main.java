import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String PROG_NAME = Main.class.getName();

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
            System.out.println("Usage: " + progName + " (1|2)");
            System.exit(0);
        }

        if (Problem.getRoutineName(args[0]) == null) {
            System.out.println("Not registered method: " + args[0]);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Problem.register("1", new Maxi());
        Problem.register("2", new Mini());

        checkArgument(PROG_NAME, args);

        String command = args[0];
        System.out.println("Running: " + Problem.getRoutineName(command));
        System.out.print("Enter integers: ");
        Problem.run(command, getData());
    }
}
