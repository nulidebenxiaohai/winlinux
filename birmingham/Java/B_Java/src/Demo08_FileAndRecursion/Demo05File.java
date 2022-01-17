package Demo08_FileAndRecursion;

import java.io.File;
import java.io.IOException;

/*
File类创建删除功能的方法
    public boolean createNewFile():当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
    public boolean delete():删除由此File表示的文件或目录
    public boolean mkdir():创建由此File表示的目录
    public boolean mkdir():拆功能键由此File表示的目录，包括任何必须但不存在的父目录
 */
public class Demo05File {
    public static void main(String[] args) throws IOException {
        show1();
    }

    private static void show1() throws IOException {
        File f1 = new File("b.txt");

        boolean b1 = f1.createNewFile();
        //boolean b2 = f1.delete();
        System.out.println(b1);
        //System.out.println(b2);
    }
}
/*
public boolean createNewFile():当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
创建文件的路径和名称在构造方法中给出（构造方法的参数）
返回值：布尔值
    true：文件不存在，创建文件，返回true
    false：文件存在，不会创建，返回false
注意：
    1.此方法只能创建文件，不能创建文件夹
    2.创建文件的路径必须存在，否则会抛出异常

public boolean createNewFile() throws IOException
createNewFile声明抛出了IOException，我们调用这个方法，就必须处理这个异常，要么throws，要么使用try/catch
 */