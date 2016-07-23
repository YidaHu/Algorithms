/*
自定义strcat函数，判断字符串大小
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
		printf("%s比较大",str1);
	}
	else
	{
		printf("%s比较大",str2);
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
