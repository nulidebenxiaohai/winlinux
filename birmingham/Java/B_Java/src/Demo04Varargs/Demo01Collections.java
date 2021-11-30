package Demo04Varargs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
    public static <T> boolean addAll(Collection<T>) c,T...elements): 往集合中添加一些元素
    public static void shuffle(List<?> List)打乱顺序：打乱集合顺序
*/
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a","b","c","d","e","f","g");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
