/*
շת����� 
z���Լ������С������ 
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
	printf("���Լ��Ϊ:%d\n",a);
	printf("��С������Ϊ:%d\n",m*n/a);
	return 0;
	
}
