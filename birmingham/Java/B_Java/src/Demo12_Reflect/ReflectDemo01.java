package Demo12_Reflect;

import Day07.Demo04.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.Class.forName("全类名")
        Class cls1 = Class.forName("Day07.Demo04.Person");
        System.out.println(cls1);
        //2.类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);
        //3.对象.getClass()
        @MyAnno
        Person p = new Person();
        System.out.println(p.getClass());
        //获取Person的Class对象
        Constructor constructor = cls2.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Object person = constructor.newInstance("yujiahua", 23);
        System.out.println(person);
    }
}
