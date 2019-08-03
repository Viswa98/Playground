#include<stdio.h>
int main()
{
	//your code here
  long int n,f=1,i,m;
  scanf("%ld",&n);
  m=abs(n);
  for(i=1;i<m+1;i++)
	f*=i;
  if(n>0)  
  printf("%ld",f);
  else if(n<0)
  printf("-%ld",f);
  else
  printf("1");
}