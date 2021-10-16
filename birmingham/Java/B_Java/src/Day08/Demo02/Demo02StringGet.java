package Day08.Demo02;
/*
String当中与获取相关的方法有：

public int length():获取字符串当中含有的字符个数，拿到字符长度
public Sting concat(String str): 将当前字符串与参数字符串拼接成为新的字符串
public char charAt(int index): 获取指定位置的单个字符。（索引从0开始）
public int indexOf(String str): 查找参数字符串在本字符串中首次出现的索引位置，如果没有返回值为-1

字符的截取方法：

public String substring(int index): 截取从参数位置到字符串末尾，返回新字符串
public String substring(int begin， int end)：截取从begin开始，一直到end结束
备注：[begin,end),包含左边，不包含右边
 */
public class Demo02StringGet {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        System.out.println(str1.substring(4,7));
    }
}
