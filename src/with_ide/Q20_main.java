package with_ide;

public class Q20_main implements Q20_child{
    @Override
    public void stop() {
        System.out.println("this is stop ");
    }

    @Override
    public void start() {
        System.out.println("this is start");
    }
}
