package com.net.fileUpAndDown;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 浏览器请求服务器 //测试路劲：http://localhost:8989/line_structure/src/com/net/fileUpAndDown/web/index.html
 */
public class SerDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端  启动 , 等待连接 .... ");
        // 创建ServerSocket 对象
        ServerSocket server = new ServerSocket(8989);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    printHtml(server);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private static void printHtml(ServerSocket server) throws IOException {
        Socket socket = server.accept();
        // 转换流读取浏览器的请求消息
        BufferedReader readWb = new
                BufferedReader(new InputStreamReader(socket.getInputStream()));
        String requst = readWb.readLine();
        // 取出请求资源的路径
        String[] strArr = requst.split(" ");
        // 去掉web前面的/
        String path = strArr[1].substring(1);
        // 读取客户端请求的资源文件
        FileInputStream fis = new FileInputStream(path);
        byte[] bytes = new byte[1024];
        int len = 0;
        // 字节输出流,将文件写会客户端
        OutputStream out = socket.getOutputStream();
        // 写入HTTP协议响应头,固定写法
        out.write("HTTP/1.1 200 OK\r\n".getBytes());
        out.write("Content-Type:text/html\r\n".getBytes());
        // 必须要写入空行,否则浏览器不解析
        out.write("\r\n".getBytes());
        while ((len = fis.read(bytes)) != -1) {
            out.write(bytes, 0, len);
        }
        fis.close();
        out.close();
        readWb.close();
        socket.close();
        socket.close();
    }
}
