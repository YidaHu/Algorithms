/*
�жϸ��ַ����ֵĴ���
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
	printf("���ָ���%d,��ĸ����%d,�����ַ�%d\n",num,zimu,qita);
	return 0;
}
