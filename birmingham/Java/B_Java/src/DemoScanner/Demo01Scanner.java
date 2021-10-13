package DemoScanner;

import java.util.Scanner;

/*
引用类型的一般使用步骤

1. 导包
import 包路径.类名称；
如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写。
是有Java.lang包下的内容不需要导包，其他的包都需要import语句。

2. 创建
类名称 对象名 = new 类名称（）；

3. 使用
对象名.成员对象名

获取键盘输入的一个int数字： int num = sc.nextInt();
获取键盘输入的一个字符串： String str = sc.next();
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        //备注：System.in代表从键盘进行输入
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        System.out.println("The number is " + num);

        System.out.println("=========");
        System.out.print("Please enter a string: ");
        String str = sc.next();
        System.out.println("This string is " + str);
    }
}
