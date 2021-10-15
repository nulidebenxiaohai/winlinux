package Day07.Demo05;

import java.util.ArrayList;
import java.util.Random;

public class Demo01Array {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            int random_number = r.nextInt(33) + 1;
            list.add(random_number);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
