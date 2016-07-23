/*
把字符串前面的*号移到后面
*/
#include<stdio.h>
void fun(char *ch,char *str2);
int main()
{
	char ch[81],string[81];
	gets(ch);
	fun(ch,string);
	printf("%s\n",string);
	return 0;
}
void fun(char *ch,char *str2)
{
	char str1[81];
	int i=0,n=0,j=0,k=0;
	while(ch[i]=='*')
	{
		str1[n++]=ch[i];
		i++;
	}
	str1[n]='\0';
	while(ch[i]!='\0')
	{
		str2[j++]=ch[i];
		i++;
	}
	while(str1[k]!='\0')
	{
		str2[j++]=str1[k];
		k++;
	}
	str2[j]='\0';
}
