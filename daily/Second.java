/**
 * Author: huyd
 * Date: 2018/9/26 16:42
 * Description: 题目求整数的2进制表示中1的个数
 * Idea: 按位与计算
 */

class Second{
	public static void main(String [] args){
		int result = Second.numberOf1(5);
		System.out.println("Sum = "+ result);
	}

	public static int numberOf1(int n){
		int sum = 0;
		while (n != 0) {
			sum++;
			n = n & (n-1);
		}
		return sum;
	}
}