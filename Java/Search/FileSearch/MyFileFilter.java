package Search;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Author: huyd
 * Date: 2017/12/23 16:31
 * Description:
 */
public class MyFileFilter implements FilenameFilter {
    //万能过滤器
    private String suffix;

    public MyFileFilter(String suffix) {
        this.suffix = suffix;
    }

    /**
     * Tests if a specified file should be included in a file list.
     *
     * @param dir  the directory in which the file was found.
     * @param name the name of the file.
     * @return <code>true</code> if and only if the name should be
     * included in the file list; <code>false</code> otherwise.
     */
    @Override
    public boolean accept(File dir, String name) {
        File f = new File(dir, name);
        if (f.isFile()) {
            return f.getName().endsWith(suffix);//符合要求的文件返回
        }
        return true;//是文件也返回
    }
}