package Day09.Demo10;

public class ZI extends Fu{
    int num =20;
    @Override
    public void method(){
        super.method();
        System.out.println("Zi method");
    }
    public void show(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
