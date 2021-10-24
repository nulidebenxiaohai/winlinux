package Day09.Demo14;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包中随便抽取一个
        int index = new Random().nextInt(list.size());
        //根据索引，从集合删除，并且得到被删除的红包，给我自己
        int delta = list.remove(index);
        //当前成员本来有多少钱
        int money = super.getMoney();
        //收红包
        super.setMoney(money+delta);
    }
}
