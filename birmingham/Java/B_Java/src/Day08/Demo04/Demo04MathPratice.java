package Day08.Demo04;

public class Demo04MathPratice {
    public static void main(String[] args) {
        double max = 5.9;
        double min = -10.8;
        int count = 0;
        for (double i = Math.ceil(min); i < max; i++){
            if (Math.abs(i)>6.0||Math.abs(i)<2.1){
                count +=1;
            }
        }
        System.out.println(count);
    }
}
