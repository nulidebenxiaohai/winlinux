package Assignment213;

public class Try {
    public static void main(String[] args) {
        String str = new String();
        str = "northeast, jsdklfjsl ,jsdklfjlskd jlsjf";
        String[] str1 = str.split("[ .,]+");
        //System.out.println(str.indexOf("east"));
        //System.out.println(str.contains("s"));
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }
        System.out.println(Math.sqrt(2147483600));
    }
}
