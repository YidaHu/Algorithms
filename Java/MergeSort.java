package sort;

import java.util.Random;
import java.util.Scanner;

/**
 * Author: huyd
 * Date: 2017/8/5 14:46
 * Description:归并排序
 * 归并排序是一种比较占内存，但却效率高且稳定的算法
 */
public class MergeSort {
    private final static int COUNT = 1000;
    private static int[] aux;//归并所需的辅助数组

    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[COUNT];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(1000) + 1;
        }

        printArray(num);

        aux = new int[num.length];//一次性分配空间
        mergeSort(num, 0, num.length - 1);

        printArray(num);


    }

    //归并排序（自顶向下的归并排序）
    public static void mergeSort(int[] num, int low, int high) {
        //将数组num[low..high]排序
        if (high <= low)
            return;
        int mid = low + (high - low) / 2;
        mergeSort(num, low, mid);//将左半边排序
        mergeSort(num, mid + 1, high);//将右半边排序
        merge(num, low, mid, high);//归并结果

    }

    //归并（原地归并的抽象方法）
    public static void merge(int[] num, int low, int mid, int high) {
        //将num[low..mid]和num[mid+1..high]归并
        int i = low, j = mid + 1;

        //将num[low..high]复制到aux[low..high]
        for (int k = low; k <= high; k++) {
            aux[k] = num[k];
        }

        //归并回到num[low..high]
        for (int k = low; k <= high; k++) {
            if (i > mid)//左半边用尽（取右半边的元素）
                num[k] = aux[j++];
            else if (j > high)//右半边用尽（取左半边的元素）
                num[k] = aux[i++];
            else if (less(aux[j], aux[i]))//右半边的当前元素小于左半边的当前元素（取右半边元素）
                num[k] = aux[j++];
            else//右半边的当前元素大于左半边的当前元素（取左半边元素）
                num[k] = aux[i++];
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