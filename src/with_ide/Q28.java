package with_ide;

public class Q28 {
    public static void main(String[] args) {
        Q28_abs abs = new Q28_abs() {
            @Override
            public void start() {
                System.out.println("this is start");
            }

            @Override
            public void stop() {
                System.out.println("this is stop");
            }
        };
        abs.start();
        abs.stop();
        abs.turn();
    }
}
