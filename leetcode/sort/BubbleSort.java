package sort;

/**
 * @Description: 冒泡排序法
 * 冒泡排序的思想就是将相邻的两个位置的数据进行比较,如果前面位置的数据大于后面位置的数据,则将两位置的数据进行交换,
 * 未排序元素中最大的数便会像一个气泡一样一路向后冒,最后会将其放在未排序数据的末尾.使其成为已排序数据的首位
 *
 * 时间复杂度O(n^2),空间复杂度O(1)
 * @Param:
 * @return:
 * @Author: huyida
 * @Date: 2019/10/21
 */

class BubbleSort {

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void printArr(int[] arr){
        if (arr == null){
            return;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(String.valueOf(arr[i]) + ' ');
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,2,3,7,1,7,6,43,21,22};
        BubbleSort.bubbleSort(arr);
        printArr(arr);
    }
}