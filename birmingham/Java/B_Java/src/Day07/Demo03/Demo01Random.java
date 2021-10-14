package Day07.Demo03;

import java.util.Random;

/*
Random 类用来生成随机数字。使用起来也是三个步骤：
1. 导包
import Java.util.Random;

2. 创建
Random r = new Random();

3. 使用
获取一个随机的int数字（范围是int所有范围，有正负两种）：int num = r.nextInt()
获取一个随机的int数字（参数代表了范围，左闭右开区间）：int num = r.nextInt(3)
其实代表了：[0,3),也就是 0，1，2
 */
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("This random number is " + num);
    }
}
