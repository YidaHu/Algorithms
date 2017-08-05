/*
√∞≈›≈≈–Ú∑®
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
	int i,j,t;
	for(i=0;i<len-1;i++)
	{
		for(j=0;j<len-1;j++)
		{
			if(a[j]>a[j+1])
			{
				t=a[j+1];
				a[j+1]=a[j];
				a[j]=t;
			}
		}
	}
}
