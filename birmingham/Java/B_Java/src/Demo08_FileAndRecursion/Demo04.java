package Demo08_FileAndRecursion;

import java.io.File;

/*
File判断功能的方法
    public boolean exists():此File表示的文件或目录是否实际存在
    public boolean isDirectory():此File表示的是否为目录
    public boolean isFile():此File表示的是否为文件
 */
public class Demo04 {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        File file = new File("D:\\MyGit\\winlinux\\birmingham\\Java\\B_Java\\src");
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println("---------------------------");
        File file1 = new File("D:\\MyGit\\winlinux\\birmingham\\Java\\B_Java\\src\\a.txt");
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.isDirectory());
    }
}
