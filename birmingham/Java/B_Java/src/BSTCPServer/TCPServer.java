package BSTCPServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 创建BS版本的TCP服务器
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建一个服务器ServerSocket，和系统要指定的端口号
        ServerSocket serverSocket = new ServerSocket(8080);
        //使用accept方法获取请求的客户端对象（浏览器）
        Socket socket = serverSocket.accept();
        //使用Socket对象中的方法getInputStream，获取到网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        //把is网络字节输入流对象哎，转换为字符缓冲输入流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
        String line = bufferedReader.readLine();
        String[] arr = line.split(" ");
        String htmlpath = arr[1].substring(1);
        //创建一个本地字节输入流，构造方法中绑定要读取的html路径
        FileInputStream fileInputStream = new FileInputStream(htmlpath);
        //使用Socket中的方法getOutStream获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();

        //写入Http协议相应头，固定写法
        os.write("Http/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        //必须写入空行，否则浏览器不解析
        os.write("\r\n".getBytes());

        //一读一写复制文件，把服务读取的html文件写回到客户端
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes)) != -1){
            os.write(bytes, 0,len);
        }
        //释放资源
        fileInputStream.close();
        socket.close();
        serverSocket.close();
    }
}
