#include<stdio.h>
int main()
{
  //Type your code here
  int n,ans=0,i=1;
  scanf("%d",&n);
  while(n!=0)
  {
  ans+=(n%10)*i;
  n/=10;
  i*=2;
  }
  printf("%d",ans);
    return 0;
}