#include<stdio.h>
int main()
{
  	//type your code here
  int n,arr[100],e1,e2,i1,i2,f1=0,f2=0,i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
  scanf("%d%d",&e1,&e2);
  for(i=0;i<n;i++)
  {
    if(arr[i]==e1)
    {
    i1=i;
  	f1=1;
}
  else if(arr[i]==e2)
  {
    i2=i;
  	f2=1;
  }
  }
  if(f1==1)
    printf("Element 1 index = %d\n",i1);
  else
    printf("Element 1 index = %d\n",-1);
  if(f2==1)
    printf("Element 2 index = %d",i2);
  else
    printf("Element 2 index = %d",-1);
}