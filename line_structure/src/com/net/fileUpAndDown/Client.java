package com.net.fileUpAndDown;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/202:19
 */
public class Client {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("E:\\e\\workeSpace\\spring_quan_jia_tong\\dataStructure\\line_structure\\src\\com\\net\\fileUpAndDown\\picture\\1.jpg");
        Socket localhost = new Socket("localhost", 8989);
        OutputStream outputStream = localhost.getOutputStream();

        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = fileInputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, len);
        }
        localhost.shutdownOutput();
        InputStream inputStream = localhost.getInputStream();
        byte[] bytes = new byte[1024];
        int length = 0;
        while ((len = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        inputStream.close();
        outputStream.close();
        fileInputStream.close();

    }
}
