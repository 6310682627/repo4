import java.util.Arrays;

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
