package com.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/201:14
 */
public class TestSocket_TCP_client {
    public static void main(String[] args) throws Exception {
        client();
    }

    /**
     * Socket(String host, int port)
     * 创建一个流套接字并将其连接到指定主机上的指定端口号。
     */
    private static void client() throws Exception {
        Socket socket = new Socket("127.0.0.1", 8989);

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好，服务器server，我是客户端client".getBytes());
        InputStream inputStream = socket.getInputStream();
        System.out.println("___________< >___client 输出start_________________");
        int len = 0;
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, read));
        System.out.println("___________</>___client 输出end_________________");
        inputStream.close();
        outputStream.close();
    }
}
