package Search;

import java.io.File;
import java.util.ArrayList;

/**
 * Author: huyd
 * Date: 2017/12/23 16:33
 * Description:深度优先搜索某一文件夹
 */
public class MyDFS {
    private static MyFileFilter myFileter = null;

    public static ArrayList<String> myDFS(File path, String suffix) {
        //list用于返回符合条件的文件
        ArrayList<String> list = new ArrayList<String>();
        //调用配置好的过滤器
        myFileter = new MyFileFilter(suffix);
        depth(path, suffix, list);
        return list;
    }

    private static void depth(File argPath, String argSuffix, ArrayList<String> argList) {
        File[] files = argPath.listFiles(myFileter);
        for (File f : files) {
            if (f.isDirectory()) {//是文件夹，直接作为需要检索的文件夹进行检索
                depth(f, argSuffix, argList);
            } else {
                argList.add(f.getAbsolutePath());//是文件则入list集合
            }
        }
    }
}