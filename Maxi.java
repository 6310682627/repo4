import java.util.Arrays;

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
