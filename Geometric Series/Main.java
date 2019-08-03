#include<stdio.h>
int power(int a,int b)
{
  int res=1,i;
  for(i=0;i<b;i++)
    res*=a;
  return res;
}
int main()
{
  //type your code here
  int n,a,r,t;
  scanf("%d",&n);
  if(n%2!=0)
  {
    t=(n+1)/2;
    a=1;
    r=2;
    printf("%d",a*power(r,t-1));
  }
  else
  {
    t=n/2;
    r=3;
    a=1;
    printf("%d",a*power(r,t-1));
  }
  return 0;
}