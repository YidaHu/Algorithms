package com.huyida.offer04;

/**
 * @program: CodingInterview
 * @description: 二维数组中的查找
 * 题目描述
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺 序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整 数。
 * 解题思路
 * 从右上角开始查找。矩阵中的一个数，它左边的数都比它小，下边的数都比它大。因此，从右 上角开始查找，就可以根据 target 和当前元素的大小关系来缩小查找区间。
 * 复杂度：O(M + N) + O(1)
 * 当前元素的查找区间为左下角的所有元素
 * @author: huyida
 * @create: 2019-07-22 23:35
 **/

public class Find {

    public static boolean find(int target, int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length, col = matrix[0].length;
        // 从右上角开始
        int r = 0, c = col - 1;
        while (c >= 0 && r <= row - 1) {
            if (target == matrix[c][r]) {
                return true;
            } else if (target > matrix[c][r]) {
                r++;
            } else {
                c--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        System.out.println(find(12, matrix));
    }
}
