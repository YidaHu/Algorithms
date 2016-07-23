/*
—°‘Ò≈≈–Ú∑®
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
	int i,j,t,min;
	for(i=0;i<len;i++)
	{
		min=i;
		for(j=i+1;j<len;j++)
		{
			if(a[min]>a[j])
			{
				min=j;
			}
		}
		if(min!=i)
		{
			t=a[min];
			a[min]=a[i];
			a[i]=t;
		}
	}
}
