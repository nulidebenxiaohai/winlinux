package Demo04Varargs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
    public static <T> void sort(List<T> list):将集合中元素按照默认规则排序

java.utils.Collections是集合工具即，用来对集合进行操作。部分方法如下：
    public static <T> void sort(List<T list, Comparator<? super T>): 将集合中元素按照指定规则排序

Comparator和Comparable的区别：
    Comparable：自己（this）和别人（参数）比较，自己需要实现Comparable接口，重写比较的规则compareTo方法
    Comparator：相当于找一个第三方的裁判，比较两个

Comparator的排序规则：
    o1-o2:升序
    o2-o1:降序
 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,8,3,5,9,6);
        System.out.println(list);

        Collections.sort(list);//默认是升序
        System.out.println(list);
        System.out.println("*******************");
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01,1,2,3,4,5,6,1,9);
        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1-o2;//升序
                return o2-o1;//降序
            }
        });
        System.out.println(list01);
    }
}
