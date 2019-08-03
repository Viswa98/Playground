#include<stdio.h>
int main()
{
	//type your code here
  int n,max=999,arr[max],i,j;
  scanf("%d",&n);
  for(i=0,j=0;i<max;i=i+2,j++)
  {
    arr[i]=j*2;
  }
  for(i=1,j=0;i<max;i=i+2,j++)
  {
    arr[i]=j;
  }
	printf("%d",arr[n-1]);
  return 0;
}