package Demo05Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
计算一个字符串中每个字符出现次数
 */
public class Demo03MapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = sc.next();
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c:str.toCharArray()){
            if (map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else{
                map.put(c,1);
            }
        }
        for (Character key:map.keySet()){
            System.out.println(key+": "+map.get(key));
        }
    }
}
