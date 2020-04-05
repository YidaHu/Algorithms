package sort;

/**
 * @program: leetcode
 * @description: 选择排序法
 * 选择排序的思想就是选择出未排序数据中最小的数放在未排序数据的首位.使其成为已排序数据的末尾.时间复杂度O(n^2),空间复杂度O(1)
 * @author: huyida
 * @create: 2019-10-22 23:34
 **/

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    swap(arr, j, minIndex);
                }
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void printArr(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(String.valueOf(arr[i]) + ' ');
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 7, 1, 7, 6, 43, 21, 22};
        selectionSort(arr);
        printArr(arr);
    }
}
