/*
查找字符串中某字符的位置
*/
#include<stdio.h>
int fun(char *ch,char c);
int main()
{
	char ch[81],c;
	int index;
	printf("请输入一个字符串:\n");
	gets(ch);
	printf("请输入需要查找的字符:\n");
	c=getchar();
	index=fun(ch,c);
	if(index==0)
	{
		printf("无此字符\n");
	}
	else
	{
		printf("该字符在字符串中第%d个位置\n",index);
	}
	return 0;
}
int fun(char *ch,char c)
{
	int i,index=0;
	for(i=0;ch[i]!='\0';i++)
	{
		if(ch[i]==c)
		{
			index=i+1;
		}
	}
	return index;
}  
