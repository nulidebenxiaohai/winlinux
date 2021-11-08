package Demo01_API;
/*
java.lang.Object类
类Object是类层级结构的根（最顶层）类，每个类都使用Object作为超（父）类
所有对象（包括数组）都实现这个类的方法
 */
public class Demo01ToString {
    public static void main(String[] args) {
        Person person = new Person("zhangsan", 18);
        String s = person.toString();
        System.out.println(s);
        //直接打印对象的名字，其实就是调用对象的toString方法 person
        System.out.println(person);
        //看一个类是否重写了toString方法，直接打印这个类对应对象的名字即可
        //如果没有重写toString方法，那么打印的就是对象的地址值（默认）
    }
}
