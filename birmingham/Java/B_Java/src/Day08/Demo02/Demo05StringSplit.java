package Day08.Demo02;
/*
分割字符串的方法：
public String[] split(String regex): 按照参数的规则，将字符串切分成若干部分。

注意事项：
split方法的参数其实是一个"正则表达式"
如果按照英文句点".",必须写"\\."（两个反斜杠）
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
