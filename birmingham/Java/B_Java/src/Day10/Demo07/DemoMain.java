package Day10.Demo07;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        //准备一个鼠标，供电脑使用
        //Mouse mouse = new Mouse();
        USB mouse = new Mouse();
        computer.useDevice(mouse);
        //创建一个键盘
        USB keyboard = new Keyboard();
        computer.useDevice(keyboard);

        computer.powerOff();
    }
}
