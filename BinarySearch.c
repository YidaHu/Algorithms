/*
二分查找法
*/
#include<stdio.h>
int main()
{
	int i,n,max,min,mid,index,a[6]={2,5,8,34,78,88};
	scanf("%d",&n);
	min=0;
	max=5;
	for(i=0;i<5;i++)
	{
		mid=(min+max)/2;
		if(a[mid]==n)
		{
			index=mid+1;
		}
		if(n<a[mid])
		{
			max=mid-1;
		}
		if(n>a[mid])
		{
			min=mid+1;
		}
	}
	printf("%d在第%d个位置\n",n,index);
	return 0;
 } 
