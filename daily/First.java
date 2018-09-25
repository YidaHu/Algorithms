/**
 * Author: huyd
 * Date: 2018/9/25 10:42
 * Description: 题目：求1+2+…+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字以及条件判断语句（A?B:C）。
 * Idea: 利用短路求值的方式
 */

class First{
	public static void main(String [] args){
		int result = First.fun(3);
		System.out.println("Sum = "+ result);
	}

	public static int fun(int n){
		int t = 0;
		boolean b = (n > 0) && ((t = fun(n-1)) > 0);
		return n + t;
	}
}