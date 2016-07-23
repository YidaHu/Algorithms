/*
ÄæÏòÊä³ö×Ö·û´®
*/
#include<stdio.h>
void fun(char *ch,char *string);
int main()
{
	char ch[81],string[81];
	gets(ch);
	puts(ch);
	fun(ch,string);
	return 0;
}
void fun(char *ch,char *string)
{
	int i,j=0;
	for(i=0;ch[i]!='\0';i++);
	for(j=i-1;j>=0;j--)
	{
		printf("%c",ch[j]);
	}
	
}
