package Demo09_IO;

import java.io.FileWriter;
import java.io.IOException;

/*
java.io.FIleWriter:文件字符数据写入到文件中
构造方法：
    FileWriter(File file) 根据给定的File对象构造一个FileWriter对象
    FIleWriter(String filename) 根据给定的文件名构造一个FileWriter对象
 */
public class Demo01Writer {
    public static void main(String[] args)  {
        FileWriter fw = null;
        try{
            fw = new FileWriter("c.txt",true);
            fw.write("NIHAO WOSHI YUJIAHUA");
        }catch (IOException e){
            System.out.println(e);
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
