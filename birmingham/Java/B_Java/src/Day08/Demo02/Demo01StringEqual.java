package Day08.Demo02;
/*
==是进行对象的地址值比较，如果的确需要字符串的内容比较，可以使用两个方法：

public boolean equals(Object obj): 参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true，否则返回false
备注：任何对象都能用Object进行接收。
注意对象：
1. equals方法具有对称型，也就是a.equals(b)/b.equals(a)。
2. 如果比较双方一个常量一个变量，推荐吧常量字符串写在前面
推荐： "abc".equal(str)

stra.equalsIgnoreCase(strb) 忽略大小写
 */
public class Demo01StringEqual {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println("Hello".equals(str1));
    }
}
