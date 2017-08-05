/*
辗转相除法 
z最大公约数和最小公倍数 
*/
#include<stdio.h>
int main()
{
	int a,b,c,m,n;
	scanf("%d %d",&a,&b);
	m=a;
	n=b;
	while(b!=0)
	{
		c=a%b;
		a=b;
		b=c;
	}
	printf("最大公约数为:%d\n",a);
	printf("最小公倍数为:%d\n",m*n/a);
	return 0;
	
}
