package Search;

import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Author: huyd
 * Date: 2017/12/23 16:34
 * Description:广度优先搜索某一文件夹
 */
public class MyBFS {
    private static MyFileFilter myFilter = null;

    public static ArrayList<String> myBFS(File argPath, String argSuffix) {
        //myList用来保存过滤出来的文件
        ArrayList<String> myList = new ArrayList<String>();
        //queue保存路径
        ArrayDeque<File> queue = new ArrayDeque<File>();
        //初始化过滤器
        myFilter = new MyFileFilter(argSuffix);
        //把要检索的文件夹路径放入队列中
        queue.offer(argPath);
        while (!queue.isEmpty()) {//判断队列不为空
            argPath = queue.poll();//把队首作为当前检索的路径
            File[] files = argPath.listFiles(myFilter);//获得当前检索的路径所有的子文件和文件夹
            for (File f : files) {
                if (f.isFile()) {
                    myList.add(f.getAbsolutePath());//是文件入list集合
                } else {
                    queue.offer(f);//是文件夹入queue作为新的需要检索文件夹的路径
                }
            }
        }
        return myList;
    }
}