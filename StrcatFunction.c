/*
�Զ���strcat�������ж��ַ�����С
*/
#include<stdio.h>
int strcat(char *str1,char *str2); 
int main()
{
	char str1[81],str2[81];
	gets(str1);
	gets(str2);
	if(strcat(str1,str2)>0)
	{
		printf("%s�Ƚϴ�",str1);
	}
	else
	{
		printf("%s�Ƚϴ�",str2);
	}
	return 0;
}
int strcat(char *str1,char *str2)
{
	while(*str1==*str2)
	{
		if(*str1=='\0')
		{
			return 0;
		}
		str1++;
		str2++;
	}
	return *str1-*str2;
}
