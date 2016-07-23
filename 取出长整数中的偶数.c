#include<stdio.h>
long fun(long a)
{
	int d,n=1;
	long t=0;
	while(a>0)
	{
		d=a%10;
		if(d%2==0)
		{
			t=d+t*10;
			
		}
		a=a/10;
	}
	return t;
 } 
int main()
{
	long a,b;
	scanf("%ld",&a);
	b=fun(a);
	printf("%ld\n",b);
	return 0;
}
