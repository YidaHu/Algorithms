package sort;

import java.util.Random;
import java.util.Scanner;

/**
 * Author: huyd
 * Date: 2017/8/5 12:42
 * Description:插入排序法
 */
public class InsertSort {
    private final static int COUNT = 1000;

    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[COUNT];
        Scanner scanner = new Scanner(System.in);
        //生成COUNT个需要排序的1-100随机数
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(1000) + 1;
        }
        printArray(num);

        long startTime=System.nanoTime();   //获取开始时间
        insertSort(num);//对数组排序
        long endTime=System.nanoTime(); //获取结束时间
        printArray(num);
        System.out.println("插入排序运行时间： "+(endTime-startTime)+"ns");

    }

    //插入排序
    public static void insertSort(int[] num) {
        for (int i = 1; i < num.length; i++) {
            for (int j = i; j > 0 && less(num[j], num[j - 1]); j--) {
                exch(num, j, j - 1);
            }
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