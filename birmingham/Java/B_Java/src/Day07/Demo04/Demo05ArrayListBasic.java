package Day07.Demo04;

import java.util.ArrayList;

/*
如果希望向集合ArrayList当中储存基本类型数据，必须使用基本类型对应的"包装类"。

基本类型  包装类（引用类型，包装类都位于java.lang包下）
byte     Byte
short    Short
int      Integer
long     Long
float    Float
double   Double
char     Character
boolean  Boolean
 */
public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println("The number is " + list.get(0));
    }


}
