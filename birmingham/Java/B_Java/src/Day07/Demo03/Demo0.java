package Day07.Demo03;

import java.util.Random;

/*
取[1，n]之间的随机数
 */
public class Demo0 {
    public static void main(String[] args) {
        int n = 10;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int number  = r.nextInt(n) + 1; //取值范围为[0，10]
            System.out.println(number);
        }

    }
}
