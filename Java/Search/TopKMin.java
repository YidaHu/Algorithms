package Search;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program: Java
 * @description:求海量数据中最小的 k 个数的问题
 * @author: huyida
 * @create: 2019-12-22 23:30
 **/

public class TopKMin {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5, 3, 8, 9, 6, 5, 2, 3, 1};
        for (int num : getLeastNumbers(nums, 3)) {
            System.out.println(num);
        }
    }

    public static Integer[] getLeastNumbers(int[] nums, int k) {
        // 默认自然排序，需手动转为降序
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                }
                return 0;
            }
        });
        for (int num : nums) {
            if (maxQueue.size() < k || num > maxQueue.peek()) { // peek()：返回队列头部的值，也就是队列最小值
                // 插入元素
                maxQueue.offer(num);
            }
            if (maxQueue.size() > k) {
                // 删除队列头部
                maxQueue.poll();
            }
        }
        return maxQueue.toArray(new Integer[0]);
    }
}
