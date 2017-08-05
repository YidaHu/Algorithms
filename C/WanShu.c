/*
求完数，一个数如果恰好等于它因子之和。6=1+2+3。 6 its factors are 1,2,3。
*/
#include<stdio.h>
int main()
{
	int i,j,k,s,n=0,m[100];
	for(i=2;i<=999;i++)
	{
		s=0;
		n=0;
		for(j=1;j<i;j++)
		{
			if(i%j==0)
			{
				m[n++]=j;
				s=s+j;
			}
		}
		m[n]='\0';
		if(s==i)
		{
			printf("%d is its factors are",s);
			for(k=0;m[k]!='\0';k++)
			{
				printf("%d",m[k]);
				if(m[k+1]!='\0')
				{
					printf(",");
				}
			}
			printf("\n");
		}
		
	}
	return 0;
	
}
