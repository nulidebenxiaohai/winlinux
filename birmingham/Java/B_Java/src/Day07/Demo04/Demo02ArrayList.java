package Day07.Demo04;

import java.util.ArrayList;

/*
数组的长度不可以发生变化。
但是Arraylist集合的长度是可以随意变化的。

对于ArrayList来说，有一个尖括号,<E>代表泛型
泛型：也就是装在集合当中的所有元素，全部都是统一的什么类型。
注意：泛型只能是引用类型，不能是基本类型。

注意事项：
对于ArrayList集合来说，直接打印得到的不是地址值，而是内容。
如果内容是空，得到的是空的括号[]。
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("Jiahua Yu");
        list.add("jiahua yu");
        list.add("yjh");
        System.out.println(list);
    }
}
