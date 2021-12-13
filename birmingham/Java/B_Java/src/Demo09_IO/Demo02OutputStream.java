package Demo09_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
一次写多个字节的方法：
    public void write(byte[] b):将b.length字节从指定的字节数组写入此输出流
    public void write(byte[] b, int off, int len):从指定的字节数组写入len字节，从偏移量off开始输出到此输出流
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("b.txt");
        fos.write(49);
        fos.write(48);
        fos.write(48);
        byte[] bytes2 = "YOU ARE GREAT\nI AM YUJIAHUA".getBytes();
        fos.write(bytes2);
        fos.close();
    }
}
