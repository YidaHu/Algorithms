package sort;

import com.sun.org.apache.regexp.internal.REUtil;

import java.util.Random;
import java.util.Scanner;

/**
 * Author: huyd
 * Date: 2017/8/5 18:30
 * Description:快速排序算法
 */
public class QuickSort {
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
        quickSort(num, 0, num.length - 1);
        long endTime = System.nanoTime(); //获取结束时间

        printArray(num);
        System.out.println("快速排序运行时间： " + (endTime - startTime) + "ns");
    }

    public static void quickSort(int[] num, int low, int high) {
        if (high <= low)
            return;
        int j = partition(num, low, high);//切分
        quickSort(num, low, j - 1);//将左半部分num[low..j-1]排序
        quickSort(num, j + 1, high);//将右半部分num[j+1,high]排序
    }

    public static int partition(int[] num, int low, int high) {
        //将数组切分为num[low..i-1],num[i],num[i+1..high]
        int i = low, j = high + 1;//左右扫描指针
        int v = num[low];//切分元素

        //如下，num[i]小于v时，我们增大i,num[j]大于v时，我们减小j，然后交换num[i]和num[j]来保证i左侧的元素都不大于v,j右侧的元素都不小于v
        //当指针相遇时交换num[low]和num[j],切分结束（这样切分值就留在num[j]中了）
        while (true) {
            //扫描左右，检查扫描是否结束并交换元素
            while (less(num[++i], v)) if (i == high) break;
            while (less(v, num[--j])) if (j == low) break;
            if (i >= j) break;
            exch(num, i, j);
        }
        exch(num, low, j);//将v = num[j] 放入正确的位置
        return j;//num[low..j-1] <= num[j] <= num[j+1..high] 达成

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