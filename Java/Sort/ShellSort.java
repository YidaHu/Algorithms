package sort;

import java.util.Random;
import java.util.Scanner;

/**
 * Author: huyd
 * Date: 2017/8/5 13:27
 * Description:希尔排序
 */
public class ShellSort {
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
        shellSort(num);
        long endTime = System.nanoTime(); //获取结束时间

        printArray(num);
        System.out.println("希尔排序运行时间： " + (endTime - startTime) + "ns");


    }

    //希尔排序
    public static void shellSort(int[] num) {
        int h = 1;
        int N = num.length;
        while (h < N / 3)
            h = h * 3 + 1;
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(num[j], num[j - h]); j -= h) {
                    exch(num, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    //判断最小值
    public static boolean less(int a, int b) {
        return a < b ? true : false;
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