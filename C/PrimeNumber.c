/*
求100-200的素数（或筛选法）
*/
#include<stdio.h>
int fun(int n);
int main()
{
	int i;
	printf("输出1-200间的素数:\n");
	for(i=1;i<=200;i++)
	{
		if(fun(i)==1)
		{
			printf("%d ",i);
		}
	}
	return 0;
}
int fun(int n)
{
	int i,k=1;
	if(n==1)
	{
		k=0;
	}
	for(i=2;i<n;i++)
	{
		if(n%i==0)
		{
			k=0;
		}
	}
	return k;	
} 
