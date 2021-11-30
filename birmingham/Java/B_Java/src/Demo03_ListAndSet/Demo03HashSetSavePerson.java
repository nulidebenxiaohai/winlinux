package Demo03_ListAndSet;

import java.util.HashSet;

/*
HashSet存储自定义类型元素
Set集合报错元素唯一：
    存储的元素（String， Integer，... Student，Person...）,必须重写hashCode方法和equals方法
要求：
    同名同年龄的人，视为同一个人，只能存储一次
 */
public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        //创建hashset集合存储Person
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("yjh",20);
        Person p2 = new Person("yjh",20);
        Person p3 = new Person("xmy",18);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
