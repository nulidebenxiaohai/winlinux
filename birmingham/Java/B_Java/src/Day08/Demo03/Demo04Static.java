package Day08.Demo03;
/*
静态内容总是优先于非静态，所以静态代码块比构造方法先执行

静态代码块的典型用途：
用来一次性地对静态成员变量进行赋值
 */
public class Demo04Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }
}
