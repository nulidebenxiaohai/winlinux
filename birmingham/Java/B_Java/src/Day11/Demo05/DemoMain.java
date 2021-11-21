package Day11.Demo05;
/*
如果接口的实现类（或者是父类的子类）只需要使用唯一的一次
那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】

匿名内部类的定义格式：
接口名称 对象名 = new 接口名称（）{
    //覆盖重写所有抽象方法
}；

对格式"new 接口名称（）{...}"进行解析：
1. new代表创建对象的动作
2. 接口名称就是匿名内部类需要实现哪个接口
3. {...}这才是匿名内部类的内容

另外还要注意几点问题：
1. 匿名内部类，在【创建内部类】的时候，只能使用唯一一次
2. 如果希望多次创建对象，而且类的内容一样，就必须使用单独定义的实现类
3. 匿名对象在【调用方法的时候】，只能调用唯一一次。如果希望多次调用，则需要给对象起个名字
4. 匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】
强调：匿名内部类和匿名对象不是一回事
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