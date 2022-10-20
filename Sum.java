import java.util.Arrays;

class Sum implements Routine {
    private static int sum(int[] data) {
        int total = data[0];
        for (int i = 1; i < data.length; i++) {
            total += data[i];
        }

        return total;
    }

    @Override
    public String toString() {
        return "sum";
    }

    @Override
    public void execute(int[] data) {
        if (data == null || data.length == 0) {
            System.out.println("Invalid input");
            System.exit(0);
        }

        System.out.println("Data: " + Arrays.toString(data));
        System.out.println("Sum: " + sum(data));
    }
}