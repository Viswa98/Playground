#include<stdio.h>
int main()
{
  //Type your code here
  int i,n,arr[100],v,f=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  scanf("%d",&arr[i]);
  scanf("%d",&v);
  for(i=0;i<n;i++)
  if(arr[i]==v)
  {
    f=1;
  	break;
  }
  if(f==1)
    printf("%d",i+1);
  else
    printf("%d isn't present in the array.",v);
  return 0;
}