package Day11.Demo07;

import java.util.ArrayList;
import java.util.List;
/*
java.util.List 正是ArrayList所实现的接口
 */
public class DemoInterface {
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<>();
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);

    }

    public static List<String> addNames(List<String> list){
        list.add("jfdj");
        list.add("dsf");
        list.add("fsfsfs");
        return list;
    }
}
