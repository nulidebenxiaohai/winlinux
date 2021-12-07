package Demo09_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
java.io.OutputStream:字节输出流
    此抽象类是表示输出字节流的所有类的超类

java.io.FileOutputStream extends OutputStream
FileOutputStream:文件字节输出流
作用：把内存中的数据写入到硬盘的文件中

构造方法：
    FileOutputStream(String name)创建一个向具有指定名称的文件中写入数据的输出文件流
    FileOutputStream(File file)创建一个向具有指定 File 对象表示的文件中写入数据的输出文件流
    参数：写入数据的目的地
        String name:目的地是一个文件的路径
        File file:目的地是一个文件
    构造方法的作用：
        1.构建一个FileOutputSteam对象
        2.会根据构造方法中传递的文件/文件路径，创建一个空的文件
        3.会把FileOutputStream对象指向创建好的文件

写入数据的原理（内存----》硬盘）
    java程序----》JVM----》OS----》OS调用写数据的方法----》把数据写入文件中

字节输出流的使用步骤：
    1.创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
    2.调用FileOutputStream对象中的方法write，把数据写入到文件中
    3.释放资源（流使用会占用一定的内存，使用完毕要把内存清空，提供程序的效率）
 */
public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("b.txt");
        fos.write(100);
        fos.close();
    }
}
