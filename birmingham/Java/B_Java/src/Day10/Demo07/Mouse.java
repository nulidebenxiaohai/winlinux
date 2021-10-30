package Day10.Demo07;

public class Mouse implements USB{

    @Override
    public void open() {
        System.out.println("Open mouse");
    }

    @Override
    public void close() {
        System.out.println("Close mouse");
    }
}
