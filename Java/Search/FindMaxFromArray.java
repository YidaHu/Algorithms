package Search;

/**
 * @program: Java
 * @description: 从10个数中找出最大值
 * @author: huyida
 * @create: 2019-12-22 23:00
 **/

public class FindMaxFromArray {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5, 3, 8, 9, 6, 5, 2, 3, 1};
        System.out.println(findMax(nums));
    }

    public static int findMax(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }
}
