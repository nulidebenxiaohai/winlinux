package Day07.Demo04;

import java.util.ArrayList;

/*
ArrayList当中的常用方法有：

public boolean add(E e):向集合当中添加元素，参数的类型和泛型一致。
public E get(int index):从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。
public E remove(int index):从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。
public int size():获取集合的尺寸长度，返回值是集合中包含的元素个数
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Jiahua Yu");
        list.add("yjh");
        list.add("yujiahua");
        list.add("jiahua yu");

        String name = list.get(1);// add element
        System.out.println("The No.2 people is " + name);

        String whorm = list.remove(3);//remove element
        System.out.println("He is: " + whorm);

        System.out.println("The size of array is: " + list.size());
    }
}
