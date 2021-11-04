package Day11.Demo05;
/*
如果接口的实现类（或者是父类的子类）只需要使用唯一的一次
那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】

匿名内部类的定义格式：
接口名称 对象名 = new 接口名称（）{
    //覆盖重写所有抽象方法
}；
 */
public class DemoMain {
    public static void main(String[] args) {
        MyInterface impl = new MyInterfaceImp();
        impl.method();
        //使用匿名内部类
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {

            }
        };
    }
}
