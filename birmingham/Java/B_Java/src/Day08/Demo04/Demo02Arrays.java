package Day08.Demo04;

import java.util.Arrays;

public class Demo02Arrays {
    public static void main(String[] args) {
        String str = "qwertyuiopasdfghjklzxcvbnm784953";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        char[] sortedChars =new char[chars.length];
        for (int i = chars.length - 1; i >= 0; i--) {
            sortedChars[chars.length - 1 -i] = chars[i];
        }
        System.out.println(sortedChars);
    }
}
