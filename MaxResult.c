/*
输入三个数求最大值 
*/
#include<stdio.h>
int fun(int a,int b,int c); 
int main()
{
	int a,b,c,m;
	scanf("%d %d %d",&a,&b,&c);
	m=fun(a,b,c);
	printf("%d\n",m);
	return 0;
} 
 int fun(int a,int b,int c)
 {
 	int max=0;
 	if(a>max)
 	{
 		max=a;
	 }
 	if(b>max)
 	{
 		max=b;
	 
	}
	if(c>max)
	{
		max=c;
	}
	return max;
 }
