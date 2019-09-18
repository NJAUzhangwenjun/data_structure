package com.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/1712:29
 */
public class MyFilenameFilter implements FilenameFilter {
    /**
     * 实现此接口的类实例可用于过滤器文件名。
     * Abstract Window Toolkit 的文件对话框组件使用这些实例过滤
     * File 类的 list 方法中的目录清单。
     * <p>
     * 测试指定文件是否应该包含在某一文件列表中。
     * <p>
     * 参数：
     * dir - 被找到的文件所在的目录。
     * name - 文件的名称。
     * <p>
     * 返回：
     * 当且仅当该名称应该包含在文件列表中时返回 true；否则返回 false。
     */
    @Override
    public boolean accept(File dir, String name) {
        return false;
    }
}
