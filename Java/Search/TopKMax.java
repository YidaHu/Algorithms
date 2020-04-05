package Search;

import java.util.PriorityQueue;

/**
 * @program: Java
 * @description: 求海量数据中最大的 k 个数的问题
 * @author: huyida
 * @create: 2019-12-22 23:23
 **/

public class TopKMax {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5, 3, 8, 9, 6, 5, 2, 3, 1};
        for (int num : getLargestNumbers(nums, 3)) {
            System.out.println(num);
        }
    }

    public static Integer[] getLargestNumbers(int[] nums, int k) {
        PriorityQueue<Integer> minQueue = new PriorityQueue<>(k); // 默认自然排序
        for (int num : nums) {
            if (minQueue.size() < k || num > minQueue.peek()) { // peek()：返回队列头部的值，也就是队列最小值
                // 插入元素
                minQueue.offer(num);
            }
            if (minQueue.size() > k) {
                // 删除队列头部
                minQueue.poll();
            }
        }
        return minQueue.toArray(new Integer[0]);
    }

}
