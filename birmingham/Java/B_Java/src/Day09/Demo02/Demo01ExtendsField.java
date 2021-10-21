package Day09.Demo02;
/*
在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式：

直接通过子类对象访问成员变量：
    等号左边是谁，就优先用谁，没有则向上找。
间接通过成员方法访问成员变量：
    该方法属于谁，就优先使用谁，没有则向上找。
 */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);//只能使用父类的东西，没有任何子类内容

        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println("========");

        System.out.println(zi.num);//优先子类，200
        //这个方法是子类的，优先用子类的，没有再向上找
        zi.methodZi();
        //这个方法是在父类当中定义的
        zi.methodFu();
    }
}
