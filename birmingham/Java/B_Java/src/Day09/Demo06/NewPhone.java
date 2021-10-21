package Day09.Demo06;

public class NewPhone extends Phone{
    @Override
    public void show(){
        //System.out.println("Show telephone number");
        super.show();
        System.out.println("Show name");
        System.out.println("Show title");
    }
}
