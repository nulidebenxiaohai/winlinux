package Day09.Demo14;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manger = new Manager("群主",100);
        Member member1 = new Member("成员1",0);
        Member member2 = new Member("成员2",10);
        Member member3 = new Member("成员3",20);

        manger.show();
        member1.show();
        member2.show();
        member3.show();
        System.out.println("===========");

        ArrayList<Integer> redList = manger.send(20,3);
        member1.receive(redList);
        member2.receive(redList);
        member3.receive(redList);
        //System.out.println("===========");
        manger.show();
        member1.show();
        member2.show();
        member3.show();

    }
}
