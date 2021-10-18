package Day08.Demo02;

import java.util.Scanner;

public class Demo07StringCount {
    public static void main(String[] args) {
        int countUpCase = 0;
        int countLowCase = 0;
        int countNum = 0;
        int countOther = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if ('A' <= array[i] && array[i] <= 'Z'){
                countUpCase += 1;
            }
            else if ('a' <= array[i] && array[i] <= 'z'){
                countLowCase += 1;
            }
            else if ('0' <= array[i] && array[i] <= '9'){
                countNum += 1;
            }
            else {
                countOther += 1;
            }
        }
        System.out.println("Up case: " + countUpCase);
        System.out.println("Low case: " + countLowCase);
        System.out.println("Number: " + countNum);
        System.out.println("Other: " + countOther);
    }
}
