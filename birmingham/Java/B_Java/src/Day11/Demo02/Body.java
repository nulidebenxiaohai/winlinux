package Day11.Demo02;

public class Body {
    public class Heart{//成员内部类
        //内部类的方法
        public void beat(){
            System.out.println("Beat");
            System.out.println("My name is " + name);
        }
    }
    private  String name;
    //外部类的方法
    public void methodBody(){
        System.out.println("外部类的方法");
    }
}
