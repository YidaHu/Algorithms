/*
多个字符串中输出最短的字符
*/
#include<stdio.h>
#define M 5
#define N 20
int fun(char (*ss)[N]);
int strlen(char ch[]);
int main()
{
	char ss[M][N]={"shanghai","beijing","guangzhou","shengzheng","tianjing"};
	int n,i;
	//for(i=0;i<M;i++) puts(ss[i]);
	n=fun(ss);
	printf("%s\n",ss[n]);
	return 0;
}
int fun(char (*ss)[N])
{
	int i,min,index;
	min=strlen(ss[0]);
	for(i=0;i<3;i++)
	{
		if(min>strlen(ss[i]))
		{
			min=strlen(ss[i]);
			index=i;
		}
	}
	return index;
}
int strlen(char ch[])
{
	int i;
	for(i=0;ch[i]!='\0';i++);
	return i;
}
