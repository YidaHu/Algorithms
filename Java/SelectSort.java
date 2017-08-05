package sort;

import java.util.Random;
import java.util.Scanner;

/**
 * Author: huyd
 * Date: 2017/8/5 12:17
 * Description:选择排序法
 * 对于长度为N的数组，选择排序需要大约为N平方/2次比较和N次交换
 */
public class SelectSort {
    private final static int COUNT = 1000;

    public static void main(String[] args) {

        Random random = new Random();
        int[] num = new int[COUNT];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(1000) + 1;
        }
        printArray(num);

        long startTime = System.nanoTime();   //获取开始时间
        selectSort(num);//对数组排序
        long endTime = System.nanoTime(); //获取结束时间

        printArray(num);
        System.out.println("选择排序运行时间： " + (endTime - startTime) + "ns");

    }

    //选择排序
    public static void selectSort(int[] num) {
        int min = 0;
        for (int i = 0; i < num.length; i++) {
            min = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[min]) {
                    min = j;
                }
            }
            exch(num, i, min);
        }
    }

    //交换两个数的值
    public static void exch(int[] num, int a, int b) {
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }

    //打印数组所有的值
    public static void printArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}