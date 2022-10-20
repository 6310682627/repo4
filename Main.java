public class Main {
    private static final String PROG_NAME = Main.class.getName();

    public static void main(String[] args) {

        Problem.register("1", new Maxi());
        Problem.register("2", new Mini());
        Problem.register("3", new Sum());

        Util.checkArgument(PROG_NAME, args);

        String command = args[0];
        System.out.println("Running: " + Problem.getRoutineName(command));
        System.out.print("Enter integers: ");
        Problem.run(command, Util.getData());
    }
}
