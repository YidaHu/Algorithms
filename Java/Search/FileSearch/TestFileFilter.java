package Search;

import java.io.File;
import java.util.ArrayList;

/**
 * Author: huyd
 * Date: 2017/12/23 16:34
 * Description:
 */
public class TestFileFilter {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        File path = new File("D:\\");
        String suffix = "tv_x64.exe";
        list = MyDFS.myDFS(path, suffix);
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------上为深度优先搜索，下位广度优先搜索---------");
        list = MyBFS.myBFS(path, suffix);
        for (String s : list) {
            System.out.println(s);
        }
    }
}