package Day08.Demo02;

import java.nio.charset.StandardCharsets;

/*
String当中与转换相关的常用方法有：

public char[] toCharArray(): 将当前字符串拆分为字符数组作为返回值
public byte[] getBytes(): 获得当前字符串底层的字节数组
public String replace(CharSequence oldString, CharSequence newString)：
将所有出现的老字符串替换成为新的字符串，返回替换后的结果新字符串。
 */
public class Demo04StringConvert {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        System.out.println(str1.toCharArray()[4]);
        System.out.println("============");
        System.out.println(str1.getBytes());
        System.out.println("============");
        System.out.println(str1.replace("o","*"));
    }
}
