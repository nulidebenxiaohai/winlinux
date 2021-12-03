package Demo05Map;

import java.util.List;
import java.util.Set;

/*
JDK9的新特性：
    List接口，Set接口，Map接口：里面增加了一个静态的方法of，可以给集合一次性添加多个元素
    static <E> List<E> of (E... elements)
    使用前提：
        当集合中存储的元素的个数已经确定了，不再改变使用
    注意：
        1.of方法只适用于List接口，Set接口，Map接口，不适用于接口的实现类
        2.of方法的返回值是一个不能改变的集合，集合不能再使用add，put方法添加元素，会抛出异常
        3.Set接口和Map接口在调用of方法时，不能有重复的元素，不然会抛出异常
 */
public class Demo01JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a","b","a","c");
        System.out.println(list);
        //list.add("w");//UnsupportedOperationException
        Set<String> set = Set.of("a","a","b","c");//IllegalArgumentException:非法参数异常
        System.out.println(set);
    }
}
