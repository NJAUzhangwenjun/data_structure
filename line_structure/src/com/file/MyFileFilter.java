package com.file;

import java.io.File;
import java.io.FileFilter;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/1712:13
 * 用于抽象路径名(File对象)的过滤器。
 * <p>
 * 此接口的实例可传递给 File 类的 listFiles(FileFilter) 方法。</p>
 */
public class MyFileFilter implements FileFilter {
    /**
     * 测试指定抽象路径名是否应该包含在某个路径名列表中。
     * <p>
     * 参数：
     * pathname - 要测试的抽象路径名
     * 返回：
     * 当且仅当应该包含 pathname 时返回 true </p>
     */
    @Override
    public boolean accept(File pathname) {
        if (pathname.getAbsolutePath().endsWith(".java") || pathname.isDirectory()) {
            return true;
        } else {
            return false;
        }
    }
}
