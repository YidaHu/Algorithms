package offer;

/**
 * @program: Java
 * @description: 替换空格
 * @author: huyida
 * @create: 2019-02-12 21:38
 **/

public class ReplaceSpace {
    public static void main(String[] args) {
        String str = "We are happy";
        StringBuffer sb = new StringBuffer(str);
        System.out.println(replaceSpace(sb));
    }

    public static String replaceSpace(StringBuffer str) {
        int p1 = str.length() - 1;
        for (int i = 0; i <= p1; i++) {
            if (str.charAt(i) == ' ') {
                str.append("  ");
            }
        }
        int p2 = str.length() - 1;
        while (p1 > 0 && p2 > p1) {
            char c = str.charAt(p1--);
            if (c == ' ') {
                str.setCharAt(p2--, '0');
                str.setCharAt(p2--, '2');
                str.setCharAt(p2--, '%');
            } else {
                str.setCharAt(p2--, c);
            }
        }
        return str.toString();
    }
}
