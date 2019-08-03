#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,c,arr[100];
  scanf("%d",&n);
  while(n!=0)
  {
    arr[c]=n%2;
    n/=2;
    c++;
  }
  for(i=c-1;i>=0;i--)
  {
    printf("%d",arr[i]);
  }
  return 0;
}