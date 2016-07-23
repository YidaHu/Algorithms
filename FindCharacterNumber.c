/*
判断各字符出现的次数
*/
#include<stdio.h>
int main()
{
	char ch[81];
	gets(ch);
	int i,num=0,zimu=0,qita=0;
	for(i=0;ch[i]!='\0';i++)
	{
		if(ch[i]>='0'&&ch[i]<='9')
		{
			num++;
		}
		else if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z'))
		{
			zimu++;
		}
		else
		{
			qita++;
		}
	}
	printf("数字个数%d,字母个数%d,其他字符%d\n",num,zimu,qita);
	return 0;
}
