/*
�ж����� 
*/
#include<stdio.h>
int isLeapYear(int i);
int main()
{
	int i;
	for(i=2000;i<=2500;i++)
	{
		if(isLeapYear(i))
		{
			printf("%d�������ꡣ\n",i);
		}
		else
		{
			printf("%d�겻�����ꡣ\n",i);
		}
	}
	return 0;
}

int isLeapYear(int i)
{
	if(i%100==0i%400==0||(i%4==0&&i%100!=0))
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
