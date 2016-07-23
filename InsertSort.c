/*
≤Â»Î≈≈–Ú∑®
*/
#include<stdio.h>
void fun(int a[],int len);
int main()
{
	int i,a[6];
	for(i=0;i<6;i++)
	{
		scanf("%d",&a[i]);
	}
	fun(a,6);
	for(i=0;i<6;i++)
	{
		printf("%d\t",a[i]);
	}
	printf("\n");
	return 0;
}
void fun(int a[],int len)
{
	int i,j,t,x;
	for(i=0;i<len;i++)
	{
		j=i;
		t=a[i];
		while(j>0&&t<a[j-1])
		{
			a[j]=a[j-1];
			j--;
		}
		a[j]=t;
	}
}
