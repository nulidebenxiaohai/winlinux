package Day10.Demo07;

public class Keyboard implements USB{

    @Override
    public void open() {
        System.out.println("Open keyboard");
    }

    @Override
    public void close() {
        System.out.println("Close keyboard");
    }
}
