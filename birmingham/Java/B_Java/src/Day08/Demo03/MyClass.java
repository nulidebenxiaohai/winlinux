package Day08.Demo03;

public class MyClass {

    int num;//成员变量
    static int numStatic;//静态变量

    //成员方法
    public void method(){
        System.out.println("This is a member method.");
        //成员方法是可以访问成员变量的
        System.out.println(num);
        //成员方法可以访问静态变量的
        System.out.println(numStatic);
    }
    //静态方法
    public static void methodStatic(){
        System.out.println("This is a static method.");
        //静态方法不能直接使用成员变量
        //System.out.println(num);
        //静态方法可以使用静态变量
        System.out.println(numStatic);
    }
}
