package com.net.fileUpAndDown;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/202:19
 */
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8989);
//        多线程循环调用，文件上传
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        upFile(serverSocket);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    /**
     * 文件上传
     *
     * @param serverSocket
     * @throws IOException
     */
    private static void upFile(ServerSocket serverSocket) throws IOException {
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        int len;
        byte[] bytes = new byte[1024];
        FileOutputStream fileOutputStream = new FileOutputStream(new File("E:\\e\\workeSpace\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\net\\fileUpAndDown\\picture\\" + System.currentTimeMillis() + ".jpg"));
        while ((len = inputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, len);
        }
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("文件上传成功！".getBytes());
        outputStream.close();
        fileOutputStream.close();
        inputStream.close();
    }
}
