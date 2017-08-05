/*
É¾³ý¶àÓà*ºÅ
*/
#include<stdio.h>
void fun(char *ch);
int main()
{
	char ch[81];
	gets(ch);
	fun(ch);
	printf("%s\n",ch);
	return 0;
}
void fun(char *ch)
{
	int i,j=0,n=0;
	for(i=0;ch[i]!='\0';i++)
	{
		 
		if(ch[i]!='*')
		{
			ch[j++]=ch[i];
		}
		
	}
	ch[j]='\0';
}
