#include<stdio.h>
int fun(int i);
int main()
{
	int i,sum;
	sum=fun(i);
	printf("1*2*3*4*5=%d\n",sum);
	return 0;
}
int fun(int i)
{
	int s=1;
	for(i=1;i<=5;i++)
	{
		s=s*i;
	}
	return s;
}
