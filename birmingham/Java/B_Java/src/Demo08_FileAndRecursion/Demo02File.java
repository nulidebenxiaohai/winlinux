package Demo08_FileAndRecursion;

import java.io.File;

/*
路径：
    相对路径：是一个完整的路径
        以盘符（c:,D：）开始的路径
    相对路径：是一个简化的路径
        相对值得是相对于当前项目的根目录
        如果使用当前项目的根目录，路径可以简化书写
    注意：
        1.路径是不区分大小写
        2.路径中的文件名称分隔符Windows使用反斜杠，反斜杠是转义字符，两个反斜杠代表一个普通的反斜杠
 */
public class Demo02File {
    public static void main(String[] args) {
        /*
        File类中的构造方法
         */
        show02("c:\\","a.txt");
    }

    private static void show02(String parent, String child) {
        File file = new File(parent,child);
    }

    private static void show01(){
        File f1= new File("D:\\MyGit\\winlinux\\birmingham\\Java\\B_Java\\src");
        System.out.println(f1);//重写了toString方法
    }
}
