package Day08.Demo02;

public class Demo06StringPratise {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(fromArrayToString(array));
    }

    public static String fromArrayToString(int array[]){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1){
                str += "word" + array[i] +"]";
            }
            else {
                str += "word" + array[i] +"#";
            }
        }
        return str;
    }
}
