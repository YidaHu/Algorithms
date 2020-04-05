package sort;

/**
 * @program: leetcode
 * @description: 插入排序法
 * 插入排序是将前i个元素排好序,然后将第’i+1’个元素插入前面已排好顺序元素中的适当位置中,时间复杂度O(n^2),空间复杂度O(1).
 * 个人认为插入排序在某些情况下是优于冒泡排序和选择排序的,比如说一个数据其中的元素是1,2,3,4,5,6,时,冒泡排序和选择排序时间复杂度仍为O(n^2),
 * 而插入排序的复杂度在此时就变成了O(n).相对而言数据排布越整齐的数组,插入排序越占优势.
 * @author: huyida
 * @create: 2019-10-22 23:38
 **/

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j > 0; j--) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
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
        insertionSort(arr);
        printArr(arr);
    }

}
