/*
�����ַ�����ĳ�ַ���λ��
*/
#include<stdio.h>
int fun(char *ch,char c);
int main()
{
	char ch[81],c;
	int index;
	printf("������һ���ַ���:\n");
	gets(ch);
	printf("��������Ҫ���ҵ��ַ�:\n");
	c=getchar();
	index=fun(ch,c);
	if(index==0)
	{
		printf("�޴��ַ�\n");
	}
	else
	{
		printf("���ַ����ַ����е�%d��λ��\n",index);
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
