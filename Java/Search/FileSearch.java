package Search;

import java.io.File;

/**
 * Author: huyd
 * Date: 2017/12/23 16:19
 * Description:深度优先搜索算法.根据文件名搜索某个盘下的文件
 */
public class FileSearch {
    /*深度优先搜索算法*/
    private static void show(File list[]) {
        int i = 0;
        while (i < list.length) {
            if (list[i].isDirectory()) {
                show(list[i].listFiles());
            } else {
       /*搜索名为some.tet的文件*/
                if (list[i].getName().equalsIgnoreCase("a.bat")) {
                    System.out.println(list[i]);/*显示some.txt的路径*/
                }

            }
            i++;
        }
    }

    public static void main(String args[]) {
        File path = new File("D:\\");/*在D盘下搜索*/
        show(path.listFiles());
    }
}