package offer;

import java.util.Arrays;

/**
 * @program: Java
 * @description: 发现数组中重复的数字
 * @author: huyida
 * @create: 2019-02-06 17:55
 **/

public class FindDup {


    public static int find_dup(int[] numbers, int length) {
        for (int i = 0; i < length; i++) {
            int index = numbers[i];
            if (index >= length) {
                index -= length;
            }
            if (numbers[index] >= length) {
                return index;
            }
            numbers[index] = numbers[index] + length;
            System.out.println(Arrays.toString(numbers));
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = {4, 1, 3, 5, 3, 6, 2};
        System.out.println(find_dup(num, num.length));

    }
}
