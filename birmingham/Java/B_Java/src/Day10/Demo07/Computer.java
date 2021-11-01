package Day10.Demo07;

public class Computer {
    public void powerOn() {
        System.out.println("Open computer");
    }
    public void powerOff() {
        System.out.println("Close computer");
    }
    public void useDevice(USB usb) {
        usb.open();
        if (usb instanceof Mouse){
            ((Mouse) usb).click();
        }
        usb.close();
    }
}
