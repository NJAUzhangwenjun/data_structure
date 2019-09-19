package com.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/201:14
 */
public class TestSocket_TCP_server {
    public static void main(String[] args) throws Exception {
        server();
    }

    private static void server() throws Exception {
        ServerSocket serverSocket = new ServerSocket(8989);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        System.out.println("___________< >___server 输出start_________________");
        int len = 0;
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, read));
        System.out.println("____________</>__server 输出end_________________");
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好，客户端client,收到你的來信，服务器server".getBytes());
        inputStream.close();
        outputStream.close();
    }

}
