package Demo09_IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
java.io.Reader:字符输入流，是字符输入流的最顶层的父类，定义了一些共性的成员方法，是一个抽象类

共性的成员方法：
    int read() 读取单个字符并返回
    int read(char[] cbuf) 一次读取多个字符，将字符读入数组
    void close() 关闭该流并释放与之关联的所有资源

java.io.FileReader extends InputStreamReader extends Reader
FileReader:文件字符输入流
作用：把硬盘文件中的数据以字符的方式读取到内存中

构造方法：
    FileReader(String fileName)
    FileReader(File file)
    参数：读取文件的数据源
        String filename:文件的路径
        File file：一个问价
    FileReader构造方法的作用：
        1.构建一个FileReader对象
        2.会把FileReader对象指向要读取的文件
 */
public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("b.txt");
        System.out.println(fr.read());
        fr.close();
    }
}
